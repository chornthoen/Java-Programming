package example_oop;

import javax.swing.JOptionPane;

public class TestObject {
    private Phone p1,p2,p3;
    void out(String m) {
    	JOptionPane.showMessageDialog(null,m);
    	
    }
    String readString(String l) {
    	return JOptionPane.showInputDialog(l);
   
    }
    int readInt(String l) {
    	return Integer.parseInt(readString(l));
    }
    double readDouble(String l) {
    	return Double.parseDouble(readString(l));
    }
    //create object by input
    Phone getPhone() {
    	
    	int c=readInt("Code");
    	String m=readString("Model");
    	double p=readDouble("Price");
    	return new Phone(c,m,p);
    }
	public TestObject() {
		//create object by default
		p1=new Phone();
		//create object by assign
		p2=new Phone(1,"Summsung",500);
		p3=getPhone();
		out(p1.toString()+p2.toString()+p3.toString());
			
	}
	public static void main(String []args) {
		new TestObject();
	}

}
