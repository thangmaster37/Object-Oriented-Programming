package bai2;
import java.util.*;
public class Sets
{
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second)
    {
        Set<Integer> intersection = new HashSet<Integer>();

        for (Integer element1 : first){
            for (Integer element2 : second){
                if (element1 == element2){
                    intersection.add(element1);
                }
            }
        }
        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second)
    {
        Set<Integer> union = new HashSet<>();
        for (Integer element : first){
            union.add(element);
        }
        for (Integer element1 : second) {
            for (Integer element2 : union){
                if (element1 != element2){
                    union.add(element1);
                }
            }
        }
        return union;
    }

    public static List<Integer> toList(Set<Integer> source)
    {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source)
    {
        Set<Integer> set = new HashSet<>(source);
        return new ArrayList<>(set);
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source)
    {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < source.size(); i++){
            int count = 0;
            if (i == 0){
                list.add(source.get(0));
            }
            for (int k = 0; k < list.size(); k++){
                if (list.get(k) != source.get(i)){
                    count += 1;
                }
            }
            if (count == list.size()){
                list.add(source.get(i));
            }
        }
        return list;
    }

    public static String firstRecurringCharacter(String s)
    {
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length - 1; i++){
            for (int k = i + 1; k < array.length; k++){
                if (Character.toString(array[i]).equals(Character.toString(array[k]))){
                    return Character.toString(array[i]);
                }
            }
        }
        return Character.toString(array[0]);
    }

    public static Set<String> allRecurringChars(String s)
    {
        Set<String> list = new HashSet<>();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length - 1; i++){
            for (int k = i + 1; k < array.length; k++){
                if (Character.toString(array[i]).equals(Character.toString(array[k]))){
                    list.add(Character.toString(array[i]));
                }
            }
        }
        return list;
    }

    public static Integer[] toArray(Set<Integer> source)
    {
        Integer[] array = new Integer[source.size()];
        return source.toArray(array);
    }

    public static int getFirst(TreeSet<Integer> source)
    {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source)
    {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value)
    {
        return source.higher(value);
    }
}
