package satsuk;

public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double square(){
        return length * width;
    }

    public double perimeter(){
        return 2 * (length + width);
    }
}
