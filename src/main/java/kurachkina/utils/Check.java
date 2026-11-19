package kurachkina.utils;

public class Check {
    public boolean isOdd(int a) {
        return a % 2 == 0;
    }

    public boolean isDevidedByThree(int a) {
        return a % 3 == 0;
    }

    public boolean isDevidedByFiveAndSeven(int a) {
        return a % 5 == 0 && a % 7 == 0;
    }
}
