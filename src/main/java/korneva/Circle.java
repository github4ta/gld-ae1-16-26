package korneva;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * (radius * radius);
    }


}
