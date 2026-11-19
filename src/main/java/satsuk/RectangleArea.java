package satsuk;

public class RectangleArea {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public RectangleArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double square(){
        return length * width;
    }
}
