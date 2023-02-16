package abstract_shape;

public class Rectangle extends Shape{
    private double height;
    private double wight;
    public Rectangle() {
        super("red");
        this.height = 1.0;
        this.wight = 1.0;
    }

    public Rectangle(String color , double height , double wight) {
        super(color);
        this.height = height;
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public double getWight() {
        return wight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }


    @Override
    public double getParameter() {
        return (getWight()+getHeight())*2;
    }

    @Override
    public double getArea() {
        return getHeight()*getWight();
    }
    public String toString(){
        return "Rectangle[Shape[color ="+getColor()+"],height ="+getHeight() +
                ",wight ="+getWight()+",parameter ="+getParameter()+",area ="+getArea()+"]";
    }
}
