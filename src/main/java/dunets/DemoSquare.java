package dunets;

import java.util.Scanner;

public class DemoSquare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите сторону и высоту треугольника: ");
        double triangleSquare = Triangle.square(console.nextInt(), console.nextInt());

        System.out.println("Введите стороны прямоугольника: ");
        int rectangleSquare = Rectangle.square(console.nextInt(), console.nextInt());

        System.out.println("Введите радиус круга: ");
        double circleSquare = Circle.square(console.nextInt());

        System.out.println("Площадь треугольника: " + triangleSquare);
        System.out.println("Площадь прямоугольника: " + rectangleSquare);
        System.out.println("Площадь круга: " + circleSquare);
    }
}
