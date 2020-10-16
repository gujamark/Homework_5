package com.labConsole;

import java.util.Scanner;

public class C {
    int a = 10, b = 9;
    char s = '#', h = '@';

    public void printInts() {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public void printChars() {
        System.out.println("s: " + s);
        System.out.println("h: " + h);
    }

    public void printIntAll() {
        System.out.println("Sum: " + (a + b));
        System.out.println("Product: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Remainder: " + (a % b));
    }

    public void setA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        a = sc.nextInt();
    }

    public void setB() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter B: ");
        b = sc.nextInt();
    }

    public void setChars() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter S: ");
        s = sc.next().charAt(0);
        System.out.println("Enter H: ");
        h = sc.next().charAt(0);
    }
}
