package korneva;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double area() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * ((p - sideA) * (p - sideB) * (p - sideC)));
    }

    double perimeter(){
       return sideA + sideB + sideC;
    }
}
