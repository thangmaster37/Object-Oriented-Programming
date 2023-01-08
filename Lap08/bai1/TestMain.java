package bai1;
import java.util.*;
public class TestMain extends Lists
{
    public static void print(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++){
            list.add(i);
        }

        insertFirst(list,666);
        insertLast(list,666);
        print(list);

        replace(list, 10);
        print(list);

        removeThird(list);
        print(list);

        removeEvil(list);
        print(list);

        ArrayList<Integer> arrayList = generateSquare();
        print(arrayList);

        reverse(list);
        reverseManual(list);
        print(list);

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++){
            list1.add(i);
        }

        System.out.println(list1);
        insertBeginningEnd(list1, 5);

        for (int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }

    }
}
