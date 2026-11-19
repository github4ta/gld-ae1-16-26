package korneva.utils;

import java.util.ArrayList;
import java.util.List;

public class MyTime {
    public static String getTimeInHoursMinutesSeconds(int timeSeconds) {
        if (timeSeconds == 0) {
            return "0 секунд";
        }

        int hours = timeSeconds / 3600;
        int minutes = (timeSeconds % 3600) / 60;
        int seconds = timeSeconds % 60;

        List<String> parts = new ArrayList<>();

        if (hours > 0) {
            parts.add(hours + " " + pluralize(hours, "час", "часа", "часов"));
        }
        if (minutes > 0) {
            parts.add(minutes + " " + pluralize(minutes, "минута", "минуты", "минут"));
        }
        if (seconds > 0) {
            parts.add(seconds + " " + pluralize(seconds, "секунда", "секунды", "секунд"));
        }

        return String.join(" ", parts);
    }

    private static String pluralize(int number, String form1, String form2, String form5) {
        int n = Math.abs(number) % 100;
        if (n >= 11 && n <= 19) {
            return form5;
        }
        int lastDigit = n % 10;
        if (lastDigit == 1) {
            return form1;
        }
        if (lastDigit >= 2 && lastDigit <= 4) {
            return form2;
        }
        return form5;
    }
}
