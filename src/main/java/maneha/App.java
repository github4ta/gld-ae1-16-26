package maneha;

import maneha.utils.Check;
import maneha.utils.RandomData;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] result = RandomData.generateArray();
        System.out.println("Длина массива: " + result.length);
        System.out.println("Элементы массива: " + Arrays.toString(result));

        int[] testNumbers = {0, 3, 4, 15, 35, -70};
        for (int num : testNumbers) {
            System.out.println("Число: " + num);
            System.out.println("  isOdd (проверка a % 2 == 0): " + Check.isOdd(num));
            System.out.println("  isDevidedByThree: " + Check.isDevidedByThree(num));
            System.out.println("  isDevidedByFiveAndSeven: " + Check.isDevidedByFiveAndSeven(num));
        }
        int[] randomArray = RandomData.generateArray();
        for (int i = 0; i < 5; i++) {
            int val = randomArray[i];
            System.out.printf("Число %d -> кратно 2: %b | кратно 3: %b | кратно 5 и 7: %b%n",
                    val,
                    Check.isOdd(val),
                    Check.isDevidedByThree(val),
                    Check.isDevidedByFiveAndSeven(val));
        }
    }
}
