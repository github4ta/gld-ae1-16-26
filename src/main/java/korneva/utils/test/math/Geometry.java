package korneva.utils.test.math;

public class Geometry {
    public int getHyp(int k1, int k2){
        double hyp = Math.sqrt(Math.pow(k1, 2) + Math.pow(k2, 2));
        return (int) Math.round(hyp);
    }
}
