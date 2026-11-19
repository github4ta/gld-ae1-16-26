package kurachkina.utils;

public class Printer {
    public void printStars() {
        for (int i = 0; i < 15; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    public void checkNumbers(int x, int y, int z) {
        int positiveCount = 0;
        if (x > 0) positiveCount++;
        if (y > 0) positiveCount++;
        if (z > 0) positiveCount++;

        switch (positiveCount) {
            case 3 -> System.out.println("excellent");
            case 2 -> System.out.println("good");
            case 1 -> System.out.println("fine");
            default -> System.out.println("bad");
        }
    }
}
