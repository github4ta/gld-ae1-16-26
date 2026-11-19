package dunets;

import java.util.Scanner;

public class DemoPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите стороны треугольника: ");
        double trianglePerimeter = Triangle.perimeter(console.nextInt(), console.nextInt(), console.nextInt());

        System.out.println("Введите стороны прямоугольника: ");
        int rectanglePerimeter = Rectangle.perimeter(console.nextInt(), console.nextInt());

        System.out.println("Введите радиус круга: ");
        double circlePerimeter = Circle.perimeter(console.nextInt());

        System.out.println("Периметр треугольника: " + trianglePerimeter);
        System.out.println("Периметр прямоугольника: " + rectanglePerimeter);
        System.out.println("Периметр круга: " + circlePerimeter);
    }
}
