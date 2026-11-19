package kurachkina.task2;

public class Utils {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.printf("Круг — площадь: %.2f, периметр: %.2f%n",
                circle.calculateArea(), circle.calculatePerimeter());

        System.out.printf("Прямоугольник — площадь: %.2f, периметр: %.2f%n",
                rectangle.calculateArea(), rectangle.calculatePerimeter());

        System.out.printf("Треугольник — площадь: %.2f, периметр: %.2f%n",
                triangle.calculateArea(), triangle.calculatePerimeter());
    }
}

