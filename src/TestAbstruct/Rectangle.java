package TestAbstruct;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(){

    }
    public Rectangle(String color,double width, double height){
        super(color);
        this.height = height;
        this.width = width;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return (height+width)*2;
    }
    public String toString(){
        return "Rectangle["+super.toString()+",Width = "+getWidth()+", Height ="+getHeight()
                +",Area = "+getArea()+",Perimeter ="+getPerimeter()+"]";
    }


}
