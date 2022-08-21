package tapshyrma17_2;

public class Circle extends Shape{
    public Circle(double a, double b){
        super(a, 3.14);
    }

    @Override
    public double getPerimetr(){
        return 2 * getA() * getB();
    }

}
