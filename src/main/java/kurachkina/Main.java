package kurachkina;

import kurachkina.phone.Phone;
import kurachkina.utils.Calculate;
import kurachkina.utils.Check;
import kurachkina.utils.Geometry;
import kurachkina.utils.MyTime;
import kurachkina.utils.Printer;
import kurachkina.utils.RandomData;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("RandomData");
        RandomData randomData = new RandomData();
        int[] randomArray = randomData.generateArray();
        System.out.println("Длина массива: " + randomArray.length);
        System.out.println("Первые 5 элементов: " + Arrays.toString(Arrays.copyOf(randomArray, 5)));

        System.out.println("Check");
        Check check = new Check();
        System.out.println("isOdd(4): " + check.isOdd(4));
        System.out.println("isDevidedByThree(9): " + check.isDevidedByThree(9));
        System.out.println("isDevidedByFiveAndSeven(35): " + check.isDevidedByFiveAndSeven(35));

        System.out.println("Calculate");
        Calculate calculate = new Calculate();
        int[] sampleNums = {10, -5, 25, 3, 12};
        System.out.println("getMax: " + calculate.getMax(sampleNums));
        System.out.println("getMin: " + calculate.getMin(sampleNums));
        System.out.println("getSumOfArrayElements: " + calculate.getSumOfArrayElements(sampleNums));
        System.out.println("getEverage(4, 5, 7): " + calculate.getEverage(4, 5, 7));

        System.out.println("MyTime");
        MyTime myTime = new MyTime();
        System.out.println("1249 сек -> " + myTime.getTimeInHoursMinutesSeconds(1249));
        System.out.println("648958 сек -> " + myTime.getTimeInHoursMinutesSeconds(648958));

        System.out.println("Geometry");
        Geometry geometry = new Geometry();
        System.out.println(geometry.getRoots(1, -5, 6));
        System.out.println(geometry.getRoots(2, 1, 5));
        System.out.println("Гипотенуза для катетов 3 и 4: " + geometry.getHyp(3, 4));

        System.out.println("Printer");
        Printer printer = new Printer();
        printer.printStars();
        printer.checkNumbers(5, 2, 8);
        printer.checkNumbers(5, -2, 8);
        printer.checkNumbers(5, -2, -8);
        printer.checkNumbers(-5, -2, -8);

        System.out.println("Phone");
        Phone phone1 = new Phone("+375-29-111-11-11", "Samsung Galaxy S24", 167.0);
        Phone phone2 = new Phone("+375-33-222-22-22", "iPhone 15", 171.0);
        Phone phone3 = new Phone("+375-44-333-33-33", "Xiaomi 14", 193.0);

        Phone[] phones = {phone1, phone2, phone3};
        for (Phone p : phones) {
            System.out.println("Модель: " + p.getModel() + ", Номер: " + p.getNumber() + ", Вес: " + p.getWeight());
            p.receiveCall("Алексей");
            System.out.println("Метод getNumber(): " + p.getNumber());
        }

        phone1.receiveCall("Мария", "+375-29-999-88-77");
        phone1.sendMessage("+375-29-111-11-11", "+375-33-222-22-22", "+375-44-333-33-33");
    }
}
