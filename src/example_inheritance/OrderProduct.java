package example_inheritance;

public class OrderProduct extends Product {
    private int qty;
    private double unitPrice;
    public OrderProduct() {
        super();
        qty = 100;
        unitPrice = 0.5;
    }
    public OrderProduct(int code, String name, int qty, double unitPrice) {
        super(code, name);
        setQty(qty);
        setUnitPrice(unitPrice);
    }

    //accessor
    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getPrice() {
        return getQty() * getUnitPrice();
    }

    public String toString() {
        return super.toString() + " ,Qty: " + getQty() +
                ",Unit Price: " + getUnitPrice() +
                " ,Price: " + getPrice() + "\n";
    }

}
