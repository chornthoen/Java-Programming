package test_abstract;

import javax.swing.JOptionPane;

public class TestObject {
	private NewYear ny;
	private String message="";
	void out(String m) {
		JOptionPane.showConfirmDialog(null, m);
	}

	public TestObject() {
		ny=new Khmer();
		message+=ny.message()+"\n";
		ny=new China();
		message+=ny.message()+"\n";
		ny=new USA();
		message+=ny.message();
		out(message);
		
	}

	public static void main(String[] args) {
		new TestObject();
	}

}
