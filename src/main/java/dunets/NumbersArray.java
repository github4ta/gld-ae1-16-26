package dunets;

public class NumbersArray {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int positiveOddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            if (numbers[i] > 0 && numbers[i] % 2 == 1) {
                positiveOddCount++;
            }
        }

        System.out.println("Количество нечетных положительных чисел массива: " + positiveOddCount);
    }
}
