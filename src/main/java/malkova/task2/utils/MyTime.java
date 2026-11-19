package malkova.task2.utils;

public class MyTime {
    public static void getTimeInHoursMinutesSeconds(int timeSeconds) {
        int hours = timeSeconds / 3600;
        int minutes = (timeSeconds % 3600) / 60;
        int seconds = timeSeconds % 60;
        System.out.println(hours + "hours" + minutes + "minutes" + seconds + "seconds");
    }
}
