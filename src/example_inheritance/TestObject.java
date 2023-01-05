package example_inheritance;

import javax.swing.JOptionPane;

public class TestObject {
    private OrderProduct p1, p2, p3;

    OrderProduct getProduct() {
        int c = readInt("Code");
        String n = readString("Name");
        int q = readInt("Qty");
        double u = readDouble("Unitprice");
        return new OrderProduct(c, n, q, u);
    }

    double readDouble(String l) {
        return Double.parseDouble(readString(l));
    }

    int readInt(String l) {
        return Integer.parseInt(readString(l));
    }

    String readString(String l) {
        return JOptionPane.showInputDialog(l);
    }

    void out(String m) {
        JOptionPane.showMessageDialog(null, m);
    }

    public TestObject() {
        p1 = new OrderProduct();
        p2 = new OrderProduct(2, "Angkor", 100, 1.5);
        p3 = getProduct();
        out(p1.toString() + p2.toString() + p3.toString());

    }

    public static void main(String[] args) {
        new TestObject();

    }

}
