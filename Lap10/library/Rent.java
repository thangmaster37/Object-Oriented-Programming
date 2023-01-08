package com.oop.library;
import java.util.Date;
public class Rent
{
    Item item;
    Date end;
    Student student;
    Date begin;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.end = end;
        this.student = student;
        this.begin = begin;
    }

    public String toString() {
        return "Rent[" +
                "item=" + item +
                ", student=" + student +
                ", begin=" + begin +
                ", end=" + end +
                ']';
    }
}
