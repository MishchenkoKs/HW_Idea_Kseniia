package org.example._Home_Work;

import java.util.Scanner;

public class TrapezoidScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону трапеции a");
        int a = scan.nextInt();
        System.out.println("Введите сторону трапеции b");
        int b = scan.nextInt();
        System.out.println("Введите сторону трапеции c");
        int c = scan.nextInt();
        System.out.println("Введите сторону трапеции d");
        int d = scan.nextInt();
        int perim = a + b + c + d;
        System.out.println("Периметр трапеци равен " + perim);
    }
}
