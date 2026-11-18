package korneva;

public class AreaOfARectangle {
    double sideA;
    double sideB;

    public AreaOfARectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double area() {
        return sideA * sideB;
    }
}
