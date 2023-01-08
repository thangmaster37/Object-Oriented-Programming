package com.oop.collections.mylist;

public class MyLinkedList extends MyAbstractList
{
    MyLinkedListNode head;
    int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index){
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++){
            current = current.getNext();
        }
        return current;
    }

    public void add(Object o){
        add(o, size);
    }

    public void add(Object o, int index){
        checkBoundaries(index, size);
        if (index == 0){
            head = new MyLinkedListNode(o, head);
        }
        else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    public Object get(int index){
        return getNodeByIndex(index).getPayload();
    }

    public void remove(int index){
        try {
            checkBoundaries(index, size - 1);
            if (index == 0){
                head = head.next;
            }
            else {
                MyLinkedListNode current = getNodeByIndex(index - 1);
                current.next = current.next.next;
            }
            size --;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Can't remove object at index " + index);
        }
    }

    public int size(){
        return size;
    }
}
