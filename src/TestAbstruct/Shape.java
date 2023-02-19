package TestAbstruct;

abstract public class Shape {
    private String color;
    public Shape(String color){
        this.color = color;
    }
    public Shape(){

    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    abstract public double getArea();
    abstract public double getPerimeter();

    public String toString(){
        return "Shape [color ='"+getColor()+"']";
    }
}
