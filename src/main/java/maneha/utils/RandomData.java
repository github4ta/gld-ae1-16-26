package maneha.utils;

import java.util.Random;

public class RandomData {
    public static int[] generateArray() {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }
}
