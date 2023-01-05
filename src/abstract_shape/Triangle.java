package abstract_shape;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

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

    public Triangle() {
        a = 3;
        b = 4;
        c = 5;
    }

    public Triangle(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
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
        return "Triangle : A= " + getA() + ",B= " + getB() + ",C= " + getC() + ",Parameter= "
                + getParameter() + ",Area =" + getArea();
    }
}
