package com.labConsole;

import java.util.Scanner;

public class B {
    int a = 33;
    double b = 9.7;
    char s = '#';

    public void printS() {
        System.out.println(s);
    }

    public void printA() {
        System.out.println(a);
    }

    public void printB() {
        System.out.println(b);
    }

    public void printDiff() {
        System.out.println(a - b);
    }

    public double getDivision() {
        return a / b;
    }

    public void setVars(int num1,double num2,char symbol) {
        a = num1;
        b = num2;
        s = symbol;
    }

    public void setA() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A: ");
        a = sc.nextInt();
    }

    public void bPlus10() {
        System.out.println(b + 10);
    }


}
