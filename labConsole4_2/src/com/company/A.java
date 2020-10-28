package com.company;

public class A {
    int a,b;
    int[] m = new int[12];

    public void assignRandomAB() {
        int min = 10;
        int max = 25;
        a = min + (int)(Math.random() * (max - min + 1));
        b = min + (int)(Math.random() * (max - min + 1));
    }

    public int[] getAB() {
        return new int[]{a, b};
    }

    public char[] getABchar() {
        char ac = (char)a;
        char bc = (char)b;

        return new char[]{ac,bc};
    }

    public int[] fillM() {
        int min = -10;
        int max = 60;
        for(int i = 0; i < m.length;i++) {
            int num = min + (int)(Math.random() * (max - min + 1));
            m[i] = num;
        }

        return m;
    }

    public void printEvensM() {
        for (int i : m) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }

    public void printSumPositives() {
        int sum = 0;
        for(int i:m) {
            if(i > 0)
                sum += i;
        }

        System.out.println(sum);
    }

    public void printMinPositive() {
        int min = 0;
        for(int i : m) {
            if(i > 0 && i < min || min == 0)
                min = i;
        }

        System.out.println(min);
    }


}
