package org.example._Home_Work;

import java.util.Scanner;

public class TriangleScan {
    public static void main(String[] args) {
        Scanner scanTr = new Scanner(System.in);
        System.out.println("Введите сторону треугольника x");
        int x = scanTr.nextInt();
        System.out.println("Введите высоту h");
        int h = scanTr.nextInt();
        int st = (int) (0.5 * x * h);
        System.out.println(st);
    }
}
