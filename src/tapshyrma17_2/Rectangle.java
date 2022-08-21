package tapshyrma17_2;

public class Rectangle extends Shape{
    public Rectangle(double a, double b){
        super(a, b);
    }
    @Override
    public double getPerimetr() {
        return 2 * (getA() + getB());
    }
}
