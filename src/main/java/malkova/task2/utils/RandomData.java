package malkova.task2.utils;

import java.util.Random;

public class RandomData {
    public static int[] generateArray() {
        Random random = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-100, 100);
        }
        return numbers;
    }
}
