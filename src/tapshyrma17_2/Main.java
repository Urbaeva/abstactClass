package tapshyrma17_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3 , 3.14);
        Trapezoid trapezoid = new Trapezoid(3, 5, 3.5, 3.5);
        Rectangle rectangle = new Rectangle(5, 6);
        Square square = new Square(4,4);
        Triangle triangle = new Triangle(3, 4, 5);

        Shape[] shapes = {circle, trapezoid, rectangle, square, triangle};
        for (Shape i: shapes) {
            System.out.println(i.getClass().getSimpleName() + "'s perimetr = " + (i.getPerimetr()));
        }
    }
}
