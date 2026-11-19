package dunets.utils.test.math;

public class Geometry {
    public static int getHyp(int k1, int k2) {
        return (int) Math.round(Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2)));
    }
}
