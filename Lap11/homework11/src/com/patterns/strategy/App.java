package com.patterns.strategy;

public class App {
    public static void main(String[] args) {
        Context context = new Context();
        int a = 2;
        int b = 3;
        int action = 1;
        if (action == 1) {
            context.setStrategy(new ConcreteStractegyAdd());
        }
        else if (action == 2) {
            context.setStrategy(new ConcreteStractegyMultiply());
        }
        else {
            context.setStrategy(new ConcreteStractegySubtract());
        }

        int result = context.executeStractegy(a, b);
        System.out.println(result);
    }
}
