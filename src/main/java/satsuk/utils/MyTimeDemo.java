package satsuk.utils;

public class MyTimeDemo {
    public static void main(String[] args) {
        MyTime myTime = new MyTime();

        System.out.println(myTime.getTimeInHoursMinutesSeconds(15634));
        System.out.println(myTime.getTimeInHoursMinutesSeconds(648958));
    }
}
