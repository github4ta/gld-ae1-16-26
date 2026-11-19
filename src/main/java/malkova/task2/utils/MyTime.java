package malkova.task2.utils;

public class MyTime {
    public static void getTimeInHoursMinutesSeconds(int timeSeconds) {
        final int SECONDS_IN_HOUR = 3600;
        final int MINUTES_IN_HOUR = 60;
        final int SECONDS_IN_MINUTE = 60;
        int hours = timeSeconds / SECONDS_IN_HOUR;
        int minutes = (timeSeconds % SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
        int seconds = timeSeconds % SECONDS_IN_MINUTE;
        System.out.println(hours + "hours " + minutes + "minutes " + seconds + "seconds");
    }
}
