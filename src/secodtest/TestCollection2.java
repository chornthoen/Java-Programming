package secodtest;

import java.util.ArrayList;

public class TestCollection2 {
	private ArrayList<Book> list=new ArrayList<Book>();
	
	void addToList() {
	   do {
		list.add(getBook());
	   }while(Myio.readString("yes or no").equalsIgnoreCase("yes"));
	}
	void showBooks() {
		Myio.out(list.toString());
	}
	
	Book getBook() {
		int c=Myio.readInt("Code");
		String t=Myio.readString("Title");
		double p=Myio.readDouble("Price");
		return new Book(c,t,p);
	}
	public TestCollection2() {
		addToList();
		showBooks();
		
	}

	public static void main(String[] args) {
		new TestCollection2();

	}

}
