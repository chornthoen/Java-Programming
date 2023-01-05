package abstract_shape;

public class Rectangle extends Shape{
    private double height;
    private double wight;

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
    public Rectangle(){
        height = 4;
        wight = 2;
    }
    public Rectangle(double height,double wight){
        setWight(wight);
        setHeight(height);
    }

    @Override
    public double getParameter() {
        return (getWight()*getHeight())*2;
    }

    @Override
    public double getArea() {
        return getHeight()*getWight();
    }
    public String toString(){
        return "Rectangle : Wight= "+getWight()+",Height= "+getHeight()+",Parameter= "+getParameter()+",Area= "+getArea();
    }
}
