package dunets.utils.phone;

public class DemoPhone {
    public static void main(String[] args) {
        Phone iPhone = new Phone("+375291234567", "IPhone 17", 210);
        Phone xiaomi = new Phone("+375449876543", "Xiaomi 15", 240);
        Phone samsung = new Phone("+375297894512", "Samsung A15", 320);

        System.out.println(String.format("Номер: %s\n" +
                        "Модель: %s\n" +
                        "Вес: %.1f",
                iPhone.getNumber(),
                iPhone.getModel(),
                iPhone.getWeight()));
        System.out.println();

        System.out.println(String.format("Номер: %s\n" +
                        "Модель: %s\n" +
                        "Вес: %.1f",
                xiaomi.getNumber(),
                xiaomi.getModel(),
                xiaomi.getWeight()));
        System.out.println();

        System.out.println(String.format("Номер: %s\n" +
                        "Модель: %s\n" +
                        "Вес: %.1f",
                samsung.getNumber(),
                samsung.getModel(),
                samsung.getWeight()));
        System.out.println();

        iPhone.receiveCall("Александр");
        xiaomi.receiveCall("Иван");
        samsung.receiveCall("Андрей");
        System.out.println();

        iPhone.receiveCall("Александр", "+375291234567");
        xiaomi.receiveCall("Иван", "+375291234567");
        samsung.receiveCall("Андрей", "+375291234567");
        System.out.println();

        iPhone.sendMessage("+375291234567",
                "+375291234567",
                "+375291234567",
                "+375291234567",
                "+375291234567");
    }
}
