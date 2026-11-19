package korneva;

public class DemoArea {
    static void main() {
        Circle circle = new Circle(12);
        double area;
        double perimeter;
        area = circle.area();
        perimeter = circle.perimeter();

        System.out.println("Площадь круга равна: " + area);
        System.out.println("Периметр круга равен: " + perimeter);

        Rectangle rectangle = new Rectangle(5.5, 10.2);
        area = rectangle.area();
        perimeter = rectangle.perimeter();
        System.out.println("Площадь прямоугольника равна: " + area);
        System.out.println("Периметр прямоугольника равен: " + perimeter);

        Triangle triangle = new Triangle(5.0, 5.0, 5.0);
        area = triangle.area();
        perimeter = triangle.perimeter();
        System.out.println("Площадь треугольника равна: " + area);
        System.out.println("Периметр треугольника равен: " + perimeter);
    }
}
