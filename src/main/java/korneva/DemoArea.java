package korneva;

public class DemoArea {
    static void main() {
        Circle circle = new Circle(12);
        double area;
        area = circle.area();
        System.out.println("Площадь круга равна: " + area);

        Rectangle rectangle = new Rectangle(5.5, 10.2);
        area = rectangle.area();
        System.out.println("Площадь прямоугольника равна: " + area);

        Triangle triangle = new Triangle(5.0, 5.0, 5.0);
        area = triangle.area();
        System.out.println("Площадь треугольника равна: " + area);
    }
}
