package korneva;

import java.util.Arrays;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 201) - 100;
        }
        System.out.println(Arrays.toString(array));

        int count = 0;
        for (int num : array) {
            if (num > 0 && num % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}