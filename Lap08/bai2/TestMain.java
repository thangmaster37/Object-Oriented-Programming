package bai2;
import java.util.*;
public class TestMain extends Sets
{
    public static void print(Set<Integer> array){
        for (Integer element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printString(Set<String> array){
        for (String element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void print(List<Integer> array){
        for (Integer element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Set<Integer> first = new HashSet<Integer>();
        for (int i = 0; i < 7; i++){
            first.add(i);
        }
        first.add(8);
        print(first);
        Set<Integer> second = new HashSet<Integer>();
        for (int i = 1; i < 5; i++){
            second.add(i);
        }

        Set<Integer> intersection = intersectionManual(first, second);
        print(intersection);

        Set<Integer> union = unionManual(first, second);
        print(union);

        List<Integer> list = toList(first);
        print(list);

        List<Integer> list1 = removeDuplicates(list);
        print(list1);

        List<Integer> list2 = removeDuplicatesManual(list);
        print(list2);

        System.out.println(firstRecurringCharacter("abcda"));

        Set<String> recurring = allRecurringChars("mamma");
        printString(recurring);

        Integer[] array = toArray(first);

        TreeSet<Integer> treeset = new TreeSet<Integer>();
        treeset.addAll(first);
        System.out.println(getFirst(treeset));
        System.out.println(getLast(treeset));
        System.out.println(getGreater(treeset, 5));
    }
}
