package bai3;
import java.util.*;
public class TestMain extends Maps
{
    public static void print(Set<Integer> array){
        for (Integer element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void print(Collection<Integer> array){
        for (Integer element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,4);
        map.put(2,5);
        map.put(3,6);
        System.out.println(count(map));
        //empty(map);
        System.out.println(contains(map, 1));
        System.out.println(containsKeyValue(map, 1,4));
        Set<Integer> set = keySet(map);
        print(set);
        Collection<Integer> value = values(map);
        print(value);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("black",0);
        map1.put("white",1);
        map1.put("red",2);
        System.out.println(getColor(1));
    }
}
