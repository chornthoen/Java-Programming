package polymorphism;

import javax.swing.*;

public class DialogPolymorphism {
    private Object student1;
    String readString(String st){
        return JOptionPane.showInputDialog(st);
    }
    int readInt(String st){
        return Integer.parseInt(readString(st));
    }
    double readDouble(String st){
        return Double.parseDouble(readString(st));
    }
    Student getStudent(){
        int id = readInt("Enter ID: ");
        String firstName = readString("Enter First Name: ");
        String lastName = readString("Enter Last Name: ");
        String group = readString("Enter Group: ");
        int year = readInt("Enter Year: ");
        return new Student(id,firstName,lastName,group,year);
    }
    void outputStudent(String student){
        JOptionPane.showMessageDialog(null,student);

    }

    public DialogPolymorphism() {
        String report = "All Object\n";
        student1 = new Person();
        report += student1.toString()+"\n";
        student1 = new Student();
        report += student1.toString() + "\n";
        student1 = new Student(2,"Chan","Tong","A5",2022);
        report += student1.toString() + "\n";
        student1 = getStudent();
        report += student1.toString() + "\n";
        outputStudent(report);
    }

    public static void main(String[] args) {
        new DialogPolymorphism();
    }

}
