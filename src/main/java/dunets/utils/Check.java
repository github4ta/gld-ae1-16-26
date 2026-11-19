package dunets.utils;

public class Check {
    public static boolean isOdd(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDividedByThree(int a) {
        if (a % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDividedByFiveAndSeven(int a) {
        if (a % 5 == 0 && a % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
