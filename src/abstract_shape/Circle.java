package abstract_shape;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        super("red");
        this.radius = 1.0;
    }

    public Circle(String color , double radius) {
        super(color);
        this.radius = radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double getParameter() {
        return 2*14.3*getRadius();
    }

    @Override
    public double getArea() {
        return 14.3*getRadius()*getRadius();
    }
    public String toString(){
        return "Circle["+ super.toString()+",radius ="+getRadius()+"" +
                ",parameter ="+getParameter()+",area ="+getArea()+"]";
    }
}
