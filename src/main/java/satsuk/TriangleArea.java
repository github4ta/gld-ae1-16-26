package satsuk;

public class TriangleArea {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public TriangleArea(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double square(){
        return (base * height) / 2;
    }
}
