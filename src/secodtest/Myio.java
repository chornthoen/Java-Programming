package secodtest;

import javax.swing.*;

public class Myio {
static void out(String m) {
	JTextArea d=new JTextArea(m,10,50);
	JOptionPane.showMessageDialog(null,d);
}
static String readString(String l) {
	return JOptionPane.showInputDialog(l);
}
static int readInt(String l) {
	return Integer.parseInt(readString(l));
}
static double readDouble(String l) {
	return Double.parseDouble(readString(l));
}
}
