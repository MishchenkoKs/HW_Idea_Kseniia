package org.example._2024_02_08;

import java.util.Arrays;
import java.util.Random;

public class ClassWork {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getIntersections(new int[]{1, 5, 9, 23, 65, 7}, new int[]{6, 7, 23, 14, 73, 23})));
        int[] array1 = {1, 5, 9, 23, 65, 7};
        int[] array2 = {6, 7, 14, 73, 23};
        System.out.println(Arrays.toString(getIntersections(array1, array2)));
//        //final
//        final int number = 8;
//        final int[] array = {1, 9, 2, 8, 5};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//
//        //random class
//        Random random = new Random();
//        int someNumber = random.nextInt();
//        System.out.println(someNumber);

    }
//дано 2 массива уникальных значений, вывести третий в котором будут храниться только
// уникальные совпадения с первых двух массивов

    public static int[] getIntersections(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    result[count] = array1[i];
                    count++;


                }
            }
        }
        return Arrays.copyOf(result, count);
    }

}
