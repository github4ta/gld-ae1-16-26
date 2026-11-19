package satsuk;

public class Main {
    public static void main(String[] args) {
        CircleArea circleArea = new CircleArea(4.1, 3.14);
        System.out.println("площадь круга: " + CircleArea.square(circleArea.getRadius(), circleArea.getPi()));

        RectangleArea rectangleArea = new RectangleArea(5, 4);
        System.out.println("площадь прямоугольника: " + rectangleArea.square());

        TriangleArea triangleArea = new TriangleArea(6, 4);
        System.out.println("площадь треугольника: " + triangleArea.square());

    }
}
