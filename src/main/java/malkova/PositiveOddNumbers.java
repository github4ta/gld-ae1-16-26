package malkova;

public class PositiveOddNumbers {
    public static void main() {
        int[] numbers = new int[100];
        fillAndPrintArray(numbers);
        getPositiveOddNumbers(numbers);
    }

    public static void fillAndPrintArray(int[] numbers){
        System.out.println("Your array");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (-2001)) + 1000;
            System.out.print(numbers[i] + "\t");
        }
    }

    public static void getPositiveOddNumbers(int[] numbers) {
        if (isEmpty(numbers)) {
            System.out.println("Array is empty. Try again");
        }

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("\nThere are " + count + " positive odd numbers");
    }

    public static boolean isEmpty(int[] numbers) {
        return numbers.length == 0 ? true : false;
    }
}
