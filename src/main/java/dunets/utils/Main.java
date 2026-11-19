package dunets.utils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] randomNumbers = RandomData.generateArray();
        System.out.println(Arrays.toString(randomNumbers));
        System.out.println();

        int testNumber = 35;
        System.out.println(Check.isOdd(testNumber));
        System.out.println(Check.isDividedByThree(testNumber));
        System.out.println(Check.isDividedByFiveAndSeven(testNumber));
        System.out.println();

        int[] numbersArray = {1, -2, 4, 0, 6};
        System.out.println(Calculate.getMax(numbersArray));
        System.out.println(Calculate.getMin(numbersArray));
        System.out.println(Calculate.getSumOfArrayElements(numbersArray));
        System.out.println();

        int timeInSeconds = 5146132;
        System.out.println(MyTime.getTimeInHoursMinutesSeconds(timeInSeconds));
        System.out.println();

        int a = 3;
        int b = 6;
        int c = 2;
        System.out.println(Geometry.getRoots(a, b, c));
        System.out.println();

        int k1 = 3;
        int k2 = 4;
        System.out.println(dunets.utils.test.math.Geometry.getHyp(k1, k2));
        System.out.println();

        Printer.printStars();
        System.out.println();

        CheckNumbers.checkNumbers(-2, 3, 0);
    }
}
