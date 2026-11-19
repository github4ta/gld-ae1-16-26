package satsuk;

public class Circle {
    private double radius;
    private static final double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double square (){
        return radius * radius * pi;
    }

    public double perimeter(){
        return 2 * pi * radius;
    }
}
