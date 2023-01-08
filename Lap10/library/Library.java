package com.oop.library;

public class Library
{
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent[] getLongestRent() {
        return rents;
    }
}
