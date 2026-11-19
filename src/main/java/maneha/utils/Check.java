package maneha.utils;

public class Check {
    public static boolean isOdd(int a) {
        return a % 2 == 0;
    }
    public static boolean isDevidedByThree(int a) {
        return a % 3 == 0;
    }
    public static boolean isDevidedByFiveAndSeven(int a) {
        return a % 5 == 0 && a % 7 == 0;
    }
}
