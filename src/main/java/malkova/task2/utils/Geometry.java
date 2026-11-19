package malkova.task2.utils;

public class Geometry {
    public static String getRoots(int a, int b, int c) {
        double D = (double) b * b - 4 * a * c;
        double x1;
        double x2;
        String result = "";
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            result = String.format("Roots of the quadratic equation %dx^2 + %dx + %d = 0 are: x1=%f x2=%f", a, b, c, x1, x2);
        } else if (D == 0) {
            x1 = (double) -b / (2 * a);
            x2 = x1;
            result = String.format("Roots of the quadratic equation %dx^2 + %dx + %d = 0 are: x1=x2=%f", a, b, c, x1);
        } else {
            result = ("The quadratic equation %dx^2 + %dx + %d = 0 doesn't have roots");
        }
        return result;
    }

    public static int getHyp(int k1, int k2) {
        int hyp = (int) Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2));
        return hyp;
    }
}
