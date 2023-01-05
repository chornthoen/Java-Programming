package lession;

import javax.swing.JOptionPane;

public class Test {
	private Computer c1,c2,c3;
	
	void out(String m)
	{
		JOptionPane.showMessageDialog(null, m);
	}
	
	String readString(String l)
	{
		return JOptionPane.showInputDialog(l);
	}
	
	int readInt(String l)
	{
		return Integer.parseInt(readString(l));
	}
	
	double readDouble(String l)
	{
		return Double.parseDouble(readString(l));
	}
	
	//int readInt(String l)
//	{
//		return Integer.parseInt(readString(l));
	//}
	
	Computer getComputer(){
		int c = readInt("code");
		String m = readString("Model");
		double p = readDouble("Price");
		int y = readInt("year");
		return new Computer(c,m,p,y);
		
	}
	
	public Test(){
		c1 = new Computer();
		c2 = new Computer(1,"Macbook pro M2",2500,2022);
		c3 = getComputer();
		out(c1.toString()+"\n"+c2.ToString()+"\n"+c3.ToString());
		
	}
	
	public static void main(String []args){
		Test test = new Test();
	}

}
