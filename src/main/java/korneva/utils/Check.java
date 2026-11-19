package korneva.utils;

public class Check {
    public static boolean isOdd(int a) {
        return (a % 2 == 0) ? true : false;
    }

    public static boolean isDevidedByThree(int a) {
        return (a % 3 == 0) ? true : false;
    }

    public static boolean isDevidedByFiveAndSeven(int a) {
        return (a % 5 == 0 && a % 7 == 0) ? true : false;
    }
}
