package tapshyrma17_2;

public class Square extends Shape {

    public Square(double a, double b){
        super(a, a);
    }

    @Override
    public double getPerimetr() {
        return  4 * getA();
    }
}
