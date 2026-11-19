package malkova;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double calculatePerimetr() {
        return 2 * radius * Math.PI;
    }
}
