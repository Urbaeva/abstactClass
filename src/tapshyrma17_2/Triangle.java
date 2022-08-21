package tapshyrma17_2;

public class Triangle extends Square{
    private double c;
    public Triangle(double a, double b, double c){
        super(a, b);
        this.c = c;
    }
    @Override
    public double getPerimetr() {
        return getA() + getB() + getC();
    }

    public double getC() {
        return c;
    }
}
