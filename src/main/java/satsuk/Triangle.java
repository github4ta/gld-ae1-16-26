package satsuk;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double height;

    public double getSideA() {
        return sideA;
    }

    public double getHeight() {
        return height;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public Triangle(double sideA, double sideB, double sideC, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public double square(){
        return (sideA * height) / 2;
    }

    public double perimeter(){
        return sideA + sideB + sideC;
    }
}
