package kurachkina.utils;

public class MyTime {
    public String getTimeInHoursMinutesSeconds(int timeSeconds) {
        int hours = timeSeconds / 3600;
        int minutes = (timeSeconds % 3600) / 60;
        int seconds = timeSeconds % 60;

        StringBuilder result = new StringBuilder();
        if (hours > 0) {
            result.append(hours).append(" ").append(formatWord(hours, "час", "часа", "часов")).append(" ");
        }
        if (minutes > 0 || hours > 0) {
            result.append(minutes).append(" ").append(formatWord(minutes, "минута", "минуты", "минут")).append(" ");
        }
        result.append(seconds).append(" ").append(formatWord(seconds, "секунда", "секунды", "секунд"));

        return result.toString().trim();
    }

    private String formatWord(int number, String one, String twoFour, String fiveZero) {
        int lastTwo = Math.abs(number) % 100;
        int lastOne = lastTwo % 10;
        if (lastTwo >= 11 && lastTwo <= 19) {
            return fiveZero;
        }
        if (lastOne == 1) {
            return one;
        }
        if (lastOne >= 2 && lastOne <= 4) {
            return twoFour;
        }
        return fiveZero;
    }
}
