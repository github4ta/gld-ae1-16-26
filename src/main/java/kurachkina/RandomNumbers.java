package kurachkina;

import java.util.Arrays;

public class RandomNumbers {
    static void main() {
        int[] numbers = new int[100];
        int positiveOddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)((Math.random()-0.5) * 2 * Integer.MAX_VALUE);

            if (numbers[i] > 0 && numbers[i] % 2 !=0) {
                positiveOddCount++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Колличество положительных чисел: " + positiveOddCount);
    }
}
