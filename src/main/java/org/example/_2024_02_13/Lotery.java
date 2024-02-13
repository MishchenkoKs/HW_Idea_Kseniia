package org.example._2024_02_13;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать класс Лотерея, реализовать в нём методы по генерации массива случайных чисел с выигрышными номерами,
 * *     и метод который определяет являются ли номера пользователя выгрышными.
 */
public class Lotery {
    public int[] getWinNumbers() {
        int[] winNumbers = new int[5];
        for (int i = 0; i < winNumbers.length; i++) {
            winNumbers[i] = getRandomNumber();

        }
        return winNumbers;
    }

    private int getRandomNumber() {
        Random random = new Random();
        int num = random.nextInt(5) + 1;
        return num;
    }

    public boolean isWinner(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
       return Arrays.equals(array1, array2);

    }

}
