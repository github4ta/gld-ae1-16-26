package satsuk.utils;

public class MyTime {
    public String getTimeInHoursMinutesSeconds(int timeSeconds){
        int hours = timeSeconds / 3600;
        int minutes = (timeSeconds % 3600) / 60;
        int seconds = timeSeconds % 60;

        return  hours + " " + getWord(hours, "час", "часа", "часов") + " " +
                minutes + " " + getWord(minutes, "минута", "минуты", "минут") + " " +
                seconds + " " + getWord(seconds, "секунда", "секунды", "секунд");
    }

    private String getWord(int number, String one, String two, String five){
        int lastTwoDigits = number % 100;
        int lastDigit = number % 10;

        if(lastTwoDigits >= 11 && lastTwoDigits <=14){
            return five;
        }

        if(lastDigit == 1){
            return one;
        } else if(lastDigit >= 2 && lastDigit <= 4){
            return two;
        } else {
            return five;
        }
    }
}
