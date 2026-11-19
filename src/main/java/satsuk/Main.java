package satsuk;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.1);
        Rectangle rectangle = new Rectangle(5, 4);
        Triangle triangle = new Triangle(6, 4, 5, 3);

        System.out.println("площадь круга: " + circle.square());
        System.out.println("периметр круга: " + circle.perimeter());
        System.out.println();

        System.out.println("площадь прямоугольника: " + rectangle.square());
        System.out.println("периметр прямоугольника: " + rectangle.perimeter());
        System.out.println();

        System.out.println("площадь треугольника: " + triangle.square());
        System.out.println("периметр треугольника: " + triangle.perimeter());

    }
}
