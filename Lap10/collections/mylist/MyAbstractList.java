package com.oop.collections.mylist;

public abstract class MyAbstractList implements MyList
{
    public void checkBoundaries(int index, int limit){
        if (index < 0 || index > limit){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size(); i++){
            sb.append(String.format("[%s]", get(i).toString()));
        }
        return sb.toString();
    }
}
