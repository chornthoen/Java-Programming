package TestAbstruct;

public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle("red",12.0);
//        System.out.println(circle);
//        Rectangle rectangle = new Rectangle("blue",12,45);
//        System.out.println(rectangle);

        Circle circle = new Circle("Blue",25);
        circle.toDisplay();

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Black");
        rectangle.setHeight(15);
        rectangle.setWidth(20);
        System.out.println(rectangle);
    }
}
