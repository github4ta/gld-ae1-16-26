package kurachkina.utils;

public class Geometry {
    public String getRoots(int a, int b, int c) {
        String equation = a + "*x^2+" + b + "*x+" + c + "=0";
        if (a == 0) {
            return "Уравнение " + equation + " не является квадратным";
        }

        double discriminant = (double) b * b - 4.0 * a * c;
        if (discriminant < 0) {
            return "Квадратное уравнение " + equation + " не имеет корней";
        }

        double x1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
        return "Корни квадратного уравнения " + equation + " равны x1=" + x1 + ", x2=" + x2;
    }

    public int getHyp(int k1, int k2) {
        double sumOfSquares = Math.pow(k1, 2) + Math.pow(k2, 2);
        return (int) Math.round(Math.sqrt(sumOfSquares));
    }
}
