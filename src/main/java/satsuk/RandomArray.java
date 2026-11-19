package satsuk;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int countPos = 0;
        int countNeg = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 201) - 100;
            if(numbers[i] > 0) {
                countPos++;
            } else if (numbers[i] < 0) {
                countNeg ++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("кол-во положительных чисел: " + countPos);
        System.out.println("кол-во отрицательных чисел: " + countNeg);
    }
}
