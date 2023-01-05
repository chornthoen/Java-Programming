package lession;

public class Computer {
    private int code;
    private String model;
    private double price;
    private int year;
    
	public Computer() {
		code = 1;
		model = "Asus";
		price = 500;
		year = 2020;
		// TODO Auto-generated constructor stub
	}
	
	public Computer(int c,String m,double p,int y)
	{
		setCode(c);
		setModel(m);
		setPrice(p);
		setYear(y);
	}
	
	public void setCode(int c) {code = c;}
	public void setModel(String m) {model =m;}
	public void setPrice(double p) {price = p;}
	public void setYear(int y) {year = y;}
	
	public int setCode() {return code;}
	public String setModel() {return model;}
	public double setPrice() {return price;}
	public int setYear() {return year;}
	
	public String ToString()
	{
		return setCode()+","+setModel()+","+setPrice()+","+setYear();
	}

}
