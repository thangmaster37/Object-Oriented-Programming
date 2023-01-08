package com.oop.collections.mylist;

import java.util.Objects;

public interface MyList
{
    public void add(Object o);
    public void add(Object o, int index);
    public void remove(int index);
    public Object get(int index);
    int size();
}
