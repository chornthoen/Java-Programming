package hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyForm1 extends JFrame {
    private JLabel l1,l2,l3;
    private JTextField tf;
    private JButton bt;
    private Container c;
    public MyForm1() {
        c=getContentPane();
        c.setLayout(null);
        l1=new JLabel("My Form");
        l1.setBounds(100,30,200,20);
        c.add(l1);
        l2=new JLabel("Name");
        l2.setBounds(60,60,50,20);
        c.add(l2);
        tf=new JTextField(12);
        tf.setBounds(120,60,150,20);
        c.add(tf);
        bt=new JButton("Add");
        bt.setBounds(280,60,60,20);
        c.add(bt);
        l3=new JLabel("");
        l3.setBounds(100,130,200,20);
        c.add(l3);
        bt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String t=tf.getText();
                l3.setText(t);
            }
        });
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new MyForm1();
    }
}