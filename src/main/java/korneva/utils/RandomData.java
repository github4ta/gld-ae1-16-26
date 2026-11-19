package korneva.utils;

import java.util.Arrays;
import java.util.Random;

public class RandomData {
    public static int[] generateArray() {
        int[] number = new int[100];
        Random random = new Random();

        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100);
        }
        return number;
    }
}
