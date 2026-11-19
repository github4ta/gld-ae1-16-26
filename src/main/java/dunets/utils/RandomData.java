package dunets.utils;

import java.util.Random;

public class RandomData {
    public static int[] generateArray() {
        int[] randomNumbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt();
        }
        return randomNumbers;
    }
}
