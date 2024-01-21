package org.example._Home_Work;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println(takeFor(a));
        System.out.println(takeWhile(a));
        System.out.println(takeDoWhile(a));
    }
    public static int takeFor(int a) {
        int value1 = 1;
        for (int i = 1; i <= a; i++) {
            value1 = value1 * i;
        }
        return value1;
    }
    public static int takeWhile(int a) {
        int value2 = 1;
        int num = 1;
        while (num <= a){
            value2 = value2 * num;
            num ++;
        }
        return value2;
    }
    public static int takeDoWhile(int a) {
        int value3 = 1;
        int num = 1;
        do {
            value3 = value3 * num;
            num ++;
        }while (num <= a);
        return value3;
    }

}
