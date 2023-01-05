package secodtest;

public class Book {
	private int code;
	private String title;
	private double price;

	public Book() {
		this(1,"Java",25.0);
		
	}

	
	public Book(int code, String title, double price) {
		super();
		this.code = code;
		this.title = title;
		this.price = price;
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
	return getCode()+","+getTitle()+","+getPrice()+"\n";
	}
	

}
