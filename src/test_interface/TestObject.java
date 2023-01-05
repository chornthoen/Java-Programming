package test_interface;

import javax.swing.JOptionPane;

public class TestObject {
	Shape shape;
	String report = " ";
	 void out(String m){
		JOptionPane.showMessageDialog(null,m);
	}
	public TestObject(){
		 shape = new Rectangle();
		 report +=shape.toString()+"\n";
		 shape = new Circle();
		 report+=shape.toString()+"\n";
		 shape = new Triangle();
		 report+=shape.toString();
		 out(report);
	}

	public static void main(String[] args) {
		new TestObject();
	}

}
