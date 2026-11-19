package malkova;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(4.0);
        Figure rectangle = new Rectangle(7.0, 2.0);
        Figure triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("Circle's area = " + circle.calculateArea());
        System.out.println("Rectangle's area = " + rectangle.calculateArea());
        System.out.println("Triangle's area = " + triangle.calculateArea());
    }
}
