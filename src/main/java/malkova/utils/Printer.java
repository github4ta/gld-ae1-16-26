package malkova.utils;

public class Printer {
    public static void printStars() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void checkNumbers(int x, int y, int z) {
        int countPositive = 0;
        if (x > 0) {
            countPositive++;
        }
        if (y > 0) {
            countPositive++;
        }
        if (z > 0) {
            countPositive++;
        }

        switch (countPositive) {
            case 3:
                System.out.println("excellent");
                break;
            case 2:
                System.out.println("good");
                break;
            case 1:
                System.out.println("good");
                break;
            default:
                System.out.println("bad");
                break;
        }
    }
}
