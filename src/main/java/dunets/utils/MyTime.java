package dunets.utils;

public class MyTime {
    public static String getTimeInHoursMinutesSeconds(int timeSeconds) {
        int hours = timeSeconds / 3600;
        int remainingSeconds = timeSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        String textHours = getEnding(hours, "час", "часа", "часов");
        String textMinutes = getEnding(minutes, "минута", "минуты", "минут");
        String textSeconds = getEnding(seconds, "секунда", "секунды", "секунд");

        if (hours == 0 && minutes == 0) {
            return String.format("%d %s", seconds, textSeconds);
        } else if (hours == 0) {
            return String.format("%d %s %d %s", minutes, textMinutes, seconds, textSeconds);
        } else if (minutes == 0) {
            return String.format("%d %s %d %s", hours, textHours, seconds, textSeconds);
        } else {
            return String.format("%d %s %d %s %d %s", hours, textHours, minutes, textMinutes, seconds, textSeconds);
        }
    }

    private static String getEnding(int number, String singularEnding, String fewEnding, String manyEnding) {
        int lastTwoDigits = number % 100;
        int lastDigit = number % 10;

        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return manyEnding;
        } else if (lastDigit == 1) {
            return singularEnding;
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return fewEnding;
        } else {
            return manyEnding;
        }
    }
}
