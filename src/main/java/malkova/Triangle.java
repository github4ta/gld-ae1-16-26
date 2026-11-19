package malkova;

public class Triangle implements Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea() {
        double halfPerimetr = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimetr * (halfPerimetr - sideA) * (halfPerimetr - sideB) * (halfPerimetr - sideC));
    }

    public double calculatePerimetr() {
        return sideA + sideB + sideC;
    }
}
