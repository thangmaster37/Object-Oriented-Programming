package com.oop.collections.mymap;

import java.util.Arrays;

public class MyHashMap implements MyMap
{
    final static int INITIAL_SIZE = 8;
    MyHashMapEntry[] table;
    int size = 0;

    public MyHashMap(){
        table = new MyHashMapEntry[INITIAL_SIZE];
    }

    public Object get(Object key){
        int bucket = getBucket(key);
        if (table[bucket] != null){
            return table[bucket].getValue();
        }
        return -1;
    }

    public void put(Object key, Object value){
        if (capacityRatio() > 0.6){
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null){
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    public void remove(Object key){
        int bucket = getBucket(key);
        if (table[bucket] != null){
            table[bucket] = null;
            size--;
        }

    }

    public boolean contains(Object o){
        return table[getBucket(o)] != null;
    }

    public int size(){
        return size;
    }
    public String toString(){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < table.length; i++){
            if (table[i] == null){
                sb.append(String.format("[bucket %d] -> null\n", i));
            }
            else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }

    int getBucket(Object key){
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key){
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    double capacityRatio(){
        return size / (double) table.length;
    }

    void enlarge(){
        table = Arrays.copyOf(table, table.length * 2);
    }
}
