package com.patterns.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStractegy(int a, int b){
        return this.strategy.execute(a,b);
    }
}
