package korneva;

public class AreaOfACircle {
    double radius;

    public AreaOfACircle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * (radius * radius);
    }
}
