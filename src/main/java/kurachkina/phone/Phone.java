package kurachkina.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + " с номера " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщение будет отправлено на следующие номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
}
