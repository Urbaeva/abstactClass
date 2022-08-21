package tapshyrma17_2;

public abstract class Shape {
    private double a;
    private double b;

    public Shape(double a, double b){
        this.a = a;
        this.b = b;
    }

    public abstract double getPerimetr();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
