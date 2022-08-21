package tapshyrma17_2;

public class Trapezoid  extends Shape{
    private double c, d;
    public Trapezoid(double a, double b, double c, double d){
        super(a, b);
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimetr() {
        return getA() + getB() + getC() + getD();
    }

    public double getD() {
        return d;
    }

    public double getC() {
        return c;
    }
}
