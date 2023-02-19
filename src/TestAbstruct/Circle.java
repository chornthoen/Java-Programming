package TestAbstruct;

public class Circle extends Shape{
    private double r;

    public Circle(){
        super();
        r = 1.0;
    }
    public Circle(String color, double r){
        super(color);
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }


    @Override
    public double getArea() {
        return 3.14*getR()*getR();
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*getR();
    }
    public String toString(){
        return "Circle["+super.toString()+"radius = "+getR()
                +",Area = "+getArea()+",Perimeter ="+getPerimeter()+"]";
    }
}
