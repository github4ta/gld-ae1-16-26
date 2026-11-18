package korneva;

public class AreaOfATriangle {
    double side;
    double height;

    public AreaOfATriangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    double area() {
        return (0.5 * side * height);
    }
}
