package korneva.utils.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    static void main() {
        Phone phone1 = new Phone("+375291111111", "Samsung", 125.1);
        Phone phone2 = new Phone("+375292222222", "IPhone", 203.2);
        Phone phone3 = new Phone("+375293333333", "Huawei", 118.7);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println("Звонит " + name + ". Номер: " + phoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight + '}';
    }
}
