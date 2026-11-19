package dunets.utils;

public class Geometry {
    public static String getRoots(int a, int b, int c) {
        int discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant) / (2 * a));
            double root2 = (-b - Math.sqrt(discriminant) / (2 * a));
            return "Корни квадратного уравнения " +
                    a + "*x^2 + " + b + "*x + " + c + "= 0 равны " +
                    "x1 = " + root1 + ", x2 = " + root2;
        } else if (discriminant == 0) {
            int root = -b / (2 * a);
            return "Корень квадратного уравнения " +
                    a + "*x^2 + " + b + "*x + " + c + "= 0 равен " +
                    "x = " + root;
        } else {
            return "Квадратное уравнение " +
                    a + "*x^2 + " + b + "*x + " + c + "= 0 не имеет корней";
        }
    }
}
