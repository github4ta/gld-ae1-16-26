package malkova.task2.utils;

public class Calculate {
    public static int getMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int getMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int getSumOfArrayElements(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static double getAverage(int num1, int num2, int num3) {
        double average = (double) (num1 + num2 + num3) / 3;
        return average;
    }
}
