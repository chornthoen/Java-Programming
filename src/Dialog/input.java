package Dialog;

import javax.swing.*;

public class input {
    public static void main(String[] args) {
        String name;
        int age;
        name = JOptionPane.showInputDialog("Enter name");
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        JOptionPane.showMessageDialog(null, "My name is "
                + name + " I'm " + age + " year old.");
    }
}
