package com.patterns.strategy;

public class ConcreteStractegyAdd implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
