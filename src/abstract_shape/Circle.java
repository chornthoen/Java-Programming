package abstract_shape;

public class Circle extends Shape{
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public Circle(){
        setRadius(2.0);
    }
    public Circle(double radius){
        setRadius(radius);
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
        return "Circle : Radius= "+getRadius()+",Parameter= "+getParameter()+",Area= "+getArea();
    }
}
