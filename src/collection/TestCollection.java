package collection;

import javax.swing.*;
import java.util.ArrayList;

public class TestCollection {

    private ArrayList<String> list;
    void out(String m){
        JTextArea jTextArea= new JTextArea(m,10,5);
        JOptionPane.showInputDialog(null,jTextArea);
    }

    String readString(String m){
        return JOptionPane.showInputDialog(m);
    }

    void addToList(){
        do {
            list.add(readString("Enter :"));
        }while (readString("Yes or No").equalsIgnoreCase("y"));
    }
    void showList(){
        out(list.toString());
    }

    public TestCollection(){
        list = new ArrayList<>();
        list.add("Chan");
        list.add("Dara");
        list.add("Heng");
        showList();
        list.add(1,"Kaka");
        showList();
        list.remove(0);
        showList();

//        addToList();
//        showList();

    }
    public static void main(String[] args) {
        new TestCollection();
    }
}
