package korneva.utils;

public class Check {
    static void main() {
        int a = 36;
        System.out.println(isOdd(a));
        System.out.println(isDevidedByThree(a));
        System.out.println(isDevidedByFiveAndSeven(a));
    }

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
