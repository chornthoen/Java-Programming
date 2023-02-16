package abstract_shape;

public class TestShape {


    public static void main(String[] args) {
        Circle circle = new Circle("red", 2.0);
        Rectangle rectangle = new Rectangle("blue", 2.0, 4.0);
        System.out.println(circle);
        System.out.println(rectangle);

    }
}
