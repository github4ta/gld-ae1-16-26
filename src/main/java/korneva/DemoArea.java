package korneva;

public class DemoArea {
    static void main() {
        AreaOfACircle areaOfACircle = new AreaOfACircle(12);
        double area;
        area = areaOfACircle.area();
        System.out.println("Площадь круга равна: " + area);

        AreaOfARectangle areaOfARectangle = new AreaOfARectangle(5.5, 10.2);
        area = areaOfARectangle.area();
        System.out.println("Площадь прямоугольника равна: " + area);

        AreaOfATriangle areaOfATriangle = new AreaOfATriangle(15.5, 20.5);
        area = areaOfATriangle.area();
        System.out.println("Площадь треугольника равна: " + area);
    }
}
