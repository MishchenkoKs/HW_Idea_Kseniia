package org.example._Home_Work;

import java.util.Scanner;

public class CubeScan {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Сторона куба x: ");
        int x = scanner1.nextInt();
        int y = (int) Math.pow(x, 3);
        System.out.println("Объем куба = " + y);
    }
}
