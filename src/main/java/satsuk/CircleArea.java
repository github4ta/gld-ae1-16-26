package satsuk;

public class CircleArea {
    private double radius;
    private double pi;

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    public CircleArea(double radius, double pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public static double square (double radius, double pi){
        double square = (radius * radius) * pi;
        return square;
    }
}
