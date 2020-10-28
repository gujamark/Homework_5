package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManipulation {
    public void method1() {
        File f = new File("data.txt");
        try {
            FileWriter fw = new FileWriter(f);
            fw.write("24\n");
            fw.write("39\n");
            fw.write("-90");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method2() {
        File d = new File("myFiles");
        File f = new File("myFiles/data1.txt");
        try {
            d.mkdir();
            FileWriter writer = new FileWriter(f);
            for (int i = 0; i < 100; i++)
                writer.write(i + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method3() {
        File d = new File("myFiles1");
        try {
            d.mkdir();
            for (int i = 1; i <= 30; i++){
                File f = new File("myFiles1/data" + i + ".txt");
                f.createNewFile();
                FileWriter writer = new FileWriter(f);
                writer.write("Programmer");
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method4() {
        File d = new File("myFiles2");
        try {
            d.mkdir();
            for (int i = 1; i <= 30; i++){
                File f = new File("myFiles2/data" + i + ".txt");
                f.createNewFile();
                FileWriter writer = new FileWriter(f);
                writer.write("Programmer" + i + "\n");
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int min = sc.nextInt();
        System.out.print("Enter num2: ");
        int max = sc.nextInt();
        try {
            File f = new File("myFiles/data2.txt");
            FileWriter writer = new FileWriter(f);
            for(int i = 0; i < 100; i ++) {
                int rand = min + (int)(Math.random() * (max - min + 1));
                writer.write(rand + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void method6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int min = sc.nextInt();
        System.out.print("Enter num2: ");
        int max = sc.nextInt();
        try {
            File f = new File("myFiles/data3.txt");
            FileWriter writer = new FileWriter(f,true);
            writer.write("============\n");
            for(int i = 0; i < 50; i ++) {
                int rand = min + (int)(Math.random() * (max - min + 1));
                writer.write(rand + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
