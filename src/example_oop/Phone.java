package example_oop;

public class Phone {
	
    private int code;
    private String model;
    private double price;
    //default constructor
	public Phone() {
		code=1;
		model="iPhone";
		price=1200;
	
	}
	//constructor with parameter
	public Phone(int c,String m,double p) {
		code=c;
		model=m;
		price=p;
		
	}
	//accessor
	public void setCode(int c) {code=c; }
	public void setModel(String m) {model=m;}
	public void setPrice(double p) {price=p;}
	public int getCode() { return code; }
	public String getModel() { return model; }
	public double getPrice() {return price; }
	
	public String toString() {
		return getCode()+","+getModel()+","+getPrice()+"\n";
	}

}
