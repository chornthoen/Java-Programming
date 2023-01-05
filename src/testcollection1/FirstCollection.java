package testcollection1;

import java.util.ArrayList;
import javax.swing.*;

public class FirstCollection {
    private ArrayList<String> list;

    void out(String m) {
        JTextArea d = new JTextArea(m, 10, 50);
        JOptionPane.showMessageDialog(null, d);
    }

    String readString(String l) {
        return JOptionPane.showInputDialog(l);
    }

    void addToList() {
        do {
            list.add(readString("Enter"));
        } while (readString("Yes or No").equalsIgnoreCase("yes"));
    }

    void showList() {
        out(list.toString());
    }

    public FirstCollection() {
        list = new ArrayList<String>();
        addToList();
        showList();
    }

    public static void main(String[] args) {
        new FirstCollection();
    }

}
