package bai1;
import java.util.*;
public class Lists
{
    public static void insertFirst(ArrayList<Integer> list, int value)
    {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value)
    {
        list.add(list.size(), value);
    }

    public static void replace(ArrayList<Integer> list, int value)
    {
        list.add(2, value);
    }

    public static void removeThird(ArrayList<Integer> list)
    {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list)
    {
        list.removeIf(integer -> integer == 666);
    }

    public static ArrayList<Integer> generateSquare()
    {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(10);
        for (int i = 1; i < 11; i++){
            arrayList.add((int) Math.pow(i,2));
        }
        return arrayList;
    }

    public static boolean contains(ArrayList<Integer> list, int value)
    {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == value){
                return true;
            }
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target)
    {
        target.clear();
        for (int i = 0; i < source.size(); i++){
            target.add(source.get(i));
        }
    }

    public static void reverse(ArrayList<Integer> list)
    {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list)
    {
        for (int i = 0; i < list.size(); i++){
            list.add(i, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value)
    {
        list.addFirst(value);
        list.addLast(value);
    }


}
