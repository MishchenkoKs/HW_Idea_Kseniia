package org.example._Home_Work;

import java.util.Scanner;

public class SphereScan {
    public static void main(String[] args) {
        Scanner scannerSphera = new Scanner(System.in);
        System.out.println("Введите радиус сферы r ");
        int r = scannerSphera.nextInt();
        double SpheraS = (int) 4 * Math.PI * Math.pow(r, 3);
        System.out.println("Площадь сферы равна " + SpheraS);

    }
}
