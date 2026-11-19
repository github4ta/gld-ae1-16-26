package korneva.utils;

public class Printer {
    public void printStars() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void checkNumbers(int x, int y, int z) {
        if (x > 0 && y > 0 && z > 0) {
            System.out.println("excellent");
        } else if (x > 0 && y > 0 || x > 0 && z > 0 || z > 0 && y > 0) {
            System.out.println("good");
        } else if (x > 0 || y > 0 || z > 0) {
            System.out.println("fine");
        } else {
            System.out.println("bad");
        }
    }
}
