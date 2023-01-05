package OOP1;

public class Phone {
    private int code;
    private String model;
    private double price;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Phone(){
        code=1001;
        model = "IPhone 14";
        price = 900.00;
    }
    public Phone(int code, String model, double price){
        this.code = code;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
    public void Display(){
        System.out.println(toString());
    }

}
