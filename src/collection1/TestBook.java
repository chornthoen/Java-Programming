package collection1;

import test_interface.TestObject;

import javax.swing.*;
import java.util.ArrayList;

public class TestBook {

    private ArrayList<Book> books = new ArrayList<>();

    void out(String st) {
        JTextArea jTextArea = new JTextArea(st, 10, 10);
        JOptionPane.showInputDialog(jTextArea);

    }

    static String readString(String st) {
        return JOptionPane.showInputDialog(st);
    }

    static double readDouble(String st) {
        return Double.parseDouble(readString(st));
    }

    static int readInt(String st) {
        return Integer.parseInt(readString(st));
    }

    Book getBook() {
        int code = readInt("Enter code:");
        String title = readString("Enter title:");
        double price = readDouble("Enter price:");
        return new Book(code,title,price);
    }
    void showBook(){
        out(books.toString()+"\n");
    }
    void addBook(){
        do {
            books.add(getBook());
        }while (readString("yes or no ").equalsIgnoreCase("yes"));
    }

    void removeBook(){
        int code = readInt("Remove code :");
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getCode() == code){
                books.remove(i);
            }
        }
    }

    public TestBook(){
        addBook();
        showBook();
        removeBook();
        showBook();
    }
    public static void main(String[] args) {
        new TestBook();
    }


}
