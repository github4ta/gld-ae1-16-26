package malkova.task2;

import malkova.task2.utils.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(RandomData.generateArray()));

        int num1 = 75;
        System.out.printf("Check number %d%n", num1);
        System.out.println("is odd? - " + Check.isOdd(num1));
        System.out.println("is Devided By Three? - " + Check.isDevidedByThree(num1));
        System.out.println("is Devided By Five And Seven? - " + Check.isDevidedByFiveAndSeven(num1));

        int[] nums = {1, 5, 48, -9, 0, 34, -75, 39};
        System.out.println("Tested array: " + Arrays.toString(nums));
        System.out.println("Max = " + Calculate.getMax(nums));
        System.out.println("Min = " + Calculate.getMin(nums));
        System.out.println("Sum = " + Calculate.getSumOfArrayElements(nums));
        System.out.println("Average of 3 4 5 = " + Calculate.getAverage(3, 4, 5));

        int timeSeconds = 234589;
        System.out.println("Seconds tested = " + timeSeconds);
        MyTime.getTimeInHoursMinutesSeconds(timeSeconds);

        System.out.println(Geometry.getRoots(2, -7, 3));
        System.out.println("Hypotenuza with katets 3 and 4 = " + Geometry.getHyp(3, 4));

        Printer.printStars();
        System.out.println("Check 3 4 -1:");
        Printer.checkNumbers(3, 4, -1);
    }
}
