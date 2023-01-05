package test_interface;

public class Triangle implements Shape{
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
    public Triangle(){
        a = 3;
        b = 4;
        c = 5;
    }
    public Triangle(double a,double b,double c){
        setA(a);
        setB(b);
        setC(c);
    }

    @Override
    public double getParamater() {
        return getA()+getB()+getC();
    }

    @Override
    public double getArea() {
        double p = getParamater()/2;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-getC()));
    }
    public String toString(){
        return "Triangle : A= "+getA()+",B= " +getB()+",C= "+getC()+",Parameter= "+getParamater()+",Area ="+getArea();
    }
}