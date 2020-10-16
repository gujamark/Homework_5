package com.labConsole;

public class A {
    int a = 10, b = 29;

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void printA() {
        System.out.println(a);
    }

    public void printB() {
        System.out.println(b);
    }

    public void printSum() {
        System.out.println(a + b);
    }

    public int getSum() {
        return a + b;
    }

    public int getProduct() {
        return a * b;
    }

    public void setAB(int num1, int num2) {
        a = num1;
        b = num2;
    }
}
