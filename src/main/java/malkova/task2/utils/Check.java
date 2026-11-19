package malkova.task2.utils;

public class Check {

    public static boolean isOdd(int number) {
        return number % 2 == 0 ? true : false;
    }

    public static boolean isDevidedByThree(int number) {
        return number % 3 == 0 ? true : false;
    }

    public static boolean isDevidedByFiveAndSeven(int number) {
        return number % 5 == 0 && number % 7 == 0 ? true : false;
    }
}
