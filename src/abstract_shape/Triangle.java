package abstract_shape;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle() {
        super("red");
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    @Override
    public double getParameter() {
        return getA() + getB() + getC();
    }
    @Override
    public double getArea() {
        double p = getParameter() / 2;
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
    }
    public String toString() {
        return "Triangle[Shape[color = " + getColor() + "],a = " + getA() + ",b = " + getB() + ",c = " + getC() +
                ",parameter = " + getParameter() + ",area = " + getArea() + "]";
    }
}
