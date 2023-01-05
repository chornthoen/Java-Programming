package abstract_shape;

import javax.swing.*;

public class TestShape {
    Shape shape;
    String report="";
    void out(String m){
        JOptionPane.showMessageDialog(null,m);
    }
    public TestShape(){
        shape = new Circle();
        report+=shape.toString()+"\n";
        shape = new Rectangle();
        report+=shape.toString()+"\n";
        shape = new Triangle();
        report+=shape.toString();
        out(report);
    }

    public static void main(String[] args) {
        new TestShape();
    }
}
