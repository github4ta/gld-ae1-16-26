package dunets.utils.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber) {
        System.out.println(String.format("Звонит: %s. Номер: %s",
                name, phoneNumber));
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
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
}
