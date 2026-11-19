import korneva.utils.Calculate;
import korneva.utils.Check;
import korneva.utils.Printer;
import korneva.utils.RandomData;
import korneva.utils.phone.Phone;
import korneva.utils.test.math.Geometry;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RandomData randomData = new RandomData();
        int[] randomArray = randomData.generateArray();
        System.out.println(Arrays.toString(Arrays.copyOf(randomArray, 100)));

        Check check = new Check();
        System.out.println(check.isOdd(10));
        System.out.println(check.isDevidedByThree(9));
        System.out.println(check.isDevidedByFiveAndSeven(35));

        Calculate calculate = new Calculate();
        int [] nums = {15, 100, -80, 99, 125, 0};
        System.out.println("Максимальное число: " + calculate.getMax(nums));
        System.out.println("Минимальное число: " + calculate.getMin(nums));
        System.out.println("Сумма элементов: " + calculate.getSumOfArrayElements(nums));
        System.out.println("Среднее: " + calculate.getEverage(1, 2, 3));

        Printer printer = new Printer();
        printer.printStars();
        printer.checkNumbers(1, 2, -5);
        printer.checkNumbers(-1, -2, -3);

        Geometry geometry = new Geometry();
        System.out.println("Гипотенуза: " + geometry.getHyp(3, 4));

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
    }
}
