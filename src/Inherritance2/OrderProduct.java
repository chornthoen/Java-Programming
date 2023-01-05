package Inherritance2;

public class OrderProduct extends Product {

    private String model;
    private double price;
    private int year;

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
    public OrderProduct(int code,String name,String model,double price,int year){
        super(code,name);
        setModel(model);
        setPrice(price);
        setYear(year);

    }
    public String toString(){

        return super.toString()+" ,model :"+getModel()+" ,price :"+getPrice()+" ,year:"+getYear();
    }
    public void Display(){
        System.out.println(toString());
    }

}
