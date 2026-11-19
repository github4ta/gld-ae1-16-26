package malkova;

public class Rectangle implements Figure {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double calculateArea() {
        return width * length;
    }
}
