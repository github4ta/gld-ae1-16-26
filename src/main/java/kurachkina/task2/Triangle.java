package kurachkina.task2;

public class Triangle {
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Стороны должны быть больше нуля");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Треугольник с такими сторонами не существует");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

