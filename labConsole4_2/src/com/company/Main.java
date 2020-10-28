package com.company;

public class Main {

    public static void main(String[] args) {

        A a = new A();
        a.assignRandomAB();
        for(int i : a.getAB())
            System.out.println(i);

        System.out.println("=========");

        for(int i : a.fillM())
            System.out.println(i);

        a.printEvensM();
        System.out.println("==========");

        a.printSumPositives();
        System.out.println("==========");

        a.printMinPositive();

    }
}
