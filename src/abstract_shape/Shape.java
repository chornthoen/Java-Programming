package abstract_shape;

abstract public class Shape {
    private String color;
    abstract double getParameter();
    abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Shape(String color) {
        this.color = color;
    }
    public String toString() {
        return "Shape[color="+getColor()+"]";
    }
}
