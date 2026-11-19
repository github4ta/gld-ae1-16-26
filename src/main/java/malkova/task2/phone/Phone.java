package malkova.task2.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.printf("A call from {%s}", name);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name, String number) {
        System.out.printf("A call from {%s} number:{%s}", name, number);
    }

    public void sendMessage(String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Send message to number:{%s}", numbers[i]);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
