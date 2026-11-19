package satsuk.utils;

public class Check {
    public boolean isOdd(int a) {
        return (a % 2 == 0) ? true : false;
    }

    public boolean isDevidedByThree(int a){
        return (a % 3 == 0) ? true : false;
    }

    public boolean isDevidedByFiveAndSeven(int a){
        return (a % 5 == 0 && a % 7 == 0) ? true : false;
    }

}
