import korneva.utils.*;
import korneva.utils.phone.Phone;
import korneva.utils.test.math.Geometry;

import java.util.Arrays;

import static korneva.utils.MyTime.getTimeInHoursMinutesSeconds;

public class Main {
    public static void main(String[] args) {
        RandomData randomData = new RandomData();
        int[] randomArray = randomData.generateArray();
        System.out.println(Arrays.toString(Arrays.copyOf(randomArray, 100)));

        System.out.println("------------------------------");
        Check check = new Check();
        System.out.println(check.isOdd(15));
        System.out.println(check.isDevidedByThree(9));
        System.out.println(check.isDevidedByFiveAndSeven(37));

        System.out.println("------------------------------");
        Calculate calculate = new Calculate();
        int [] nums = {15, 100, -80, 99, 125, 0};
        System.out.println("Максимальное число: " + calculate.getMax(nums));
        System.out.println("Минимальное число: " + calculate.getMin(nums));
        System.out.println("Сумма элементов: " + calculate.getSumOfArrayElements(nums));
        System.out.println("Среднее: " + calculate.getEverage(1, 2, 3));

        System.out.println("------------------------------");
        Printer printer = new Printer();
        printer.printStars();

        System.out.println("------------------------------");
        printer.checkNumbers(1, 2, -5);
        printer.checkNumbers(-1, -2, -3);

        System.out.println("------------------------------");
        Geometry geometry = new Geometry();
        System.out.println("Гипотенуза: " + geometry.getHyp(3, 4));

        System.out.println("------------------------------");
        Phone phone1 = new Phone("+375291111111", "iPhone 15", 170);
        Phone phone2 = new Phone("+375292222222", "Samsung S24", 167);
        Phone phone3 = new Phone("+375293333333", "Xiaomi 14", 190);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Ann");
        phone2.receiveCall("Pit", "+375299999999");
        System.out.println("Номер первого телефона: " + phone1.getNumber());
        phone3.sendMessage("+375291111111", "+375292222222", "+375294444444");

        System.out.println("------------------------------");
        System.out.println(getTimeInHoursMinutesSeconds(12469));
    }
}
