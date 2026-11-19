package korneva;

public class Rectangle {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double area() {
        return sideA * sideB;
    }

    double perimeter() {
        return 2 * (sideA + sideB);
    }
}
