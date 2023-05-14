package com.kodilla;

public class Calculator {

    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int CalculatorAdd() {
        System.out.println("a + b = " + (a + b));
        return a+b;
    }

    public int CalculatorSubtract() {
        System.out.println("a - b = " + (a - b));
        return a-b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
