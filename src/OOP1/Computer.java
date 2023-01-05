package OOP1;

public class Computer {
    private int code;
    private String model;
    private double price;
    public int year;

    public void setCode(int code){
        this.code= code;
    }

    public int getCode() {
        return code;
    }
    public  void setModel(String model){
        this.model = model;
    }
    public  String getModel(){
        return model;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public  Computer(int code,String model,double price,int year){
        this.code = code;
        this.model = model;
        this.price = price;
        this.year= year;
    }

    public String toString(){
        return "Computer = { " +
                "Code = " + code+
                ",model = " + model +
                ",Price = " + price +
                ",Year = " + year +
                " },";
    }
    public void disPlay(){
        System.out.println(toString());
    }
}
