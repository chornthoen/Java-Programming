package secodtest;
import java.util.*;
public class TestCollection1 {
	private ArrayList<String>l=new ArrayList<String>();

	public TestCollection1() {
		l.add("sok");
		l.add("Dara");
		l.add(0,"RUPP");
		System.out.println(l.toString());
		l.set(0, "Tong");
		l.add("newyear");
		System.out.println(l.toString());
		l.remove(1);
		System.out.println(l.toString());
	
	}
	public static void main(String[] args) {
		new TestCollection1();

	}

}
