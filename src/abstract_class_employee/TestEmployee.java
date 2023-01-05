package abstract_class_employee;

import javax.swing.*;

public class TestEmployee {
    Employee employee[];
    String report="All Employee!!\n";

    double readDouble(String l){
        return Double.parseDouble(readString(l));
    }
    int readInt(String l){
        return Integer.parseInt(readString(l));
    }
    String readString(String l){
        return JOptionPane.showInputDialog(l);
    }

    void out(String m){
        JTextArea d=  new JTextArea(m,10,50);
        JOptionPane.showMessageDialog(null,d);
    }
    PartTime getPartTime(){
        int id = readInt("Enter ID:");
        String name = readString("Enter name:");
        double hour = readDouble("Enter hour:");
        double rate = readDouble("Enter rate:");
        return new PartTime(id,name,hour,rate);
    }
    FullTime getFullTime(){
        int id = readInt("Enter ID:");
        String name = readString("Enter name:");
        double salary = readDouble("Enter salary:");
        return new FullTime(id,name,salary);
    }

    Sale getSale(){
        int id = readInt("Enter ID:");
        String name = readString("Enter name:");
        double base = readDouble("Enter base:");
        double amount = readDouble("Enter amount:");
        return new Sale(id,name,base,amount);
    }

    char key(String key){
        char ch;
        do {
            ch = readString("Choose in ["+key+"]").charAt(0);
        }while (key.indexOf(ch)==-1);
        return ch;
    }
    Employee getEmployee(){
        Employee e=null;
        switch (key("FfPpSs")){
            case 'f': case 'F':
                return e= getFullTime();
            case 'P': case 'p':
                return e= getPartTime();
            case 'S': case 's':
                return e = getSale();
        }
        return e;
    }
    public TestEmployee(){
        int n = readInt("Enter number employee:");
        employee = new Employee[n];
        for (int i = 0; i < n; i++) {
            employee[i] = getEmployee();
        }
        for (int i = 0; i < n; i++) {
            report += employee[i].toString()+"\n";
        }
        out(report);

//        employee = new PartTime(1,"Sok Chan",200,30);
//        report+=employee.toString()+"\n";
//        employee = new FullTime(2,"Heng Khim",700);
//        report+=employee.toString()+"\n";
//        employee= new Sale(3,"Veasna kho",300,400);
//        report+=employee.toString();
//        out(report);


    }
    public static void main(String[] args) {
        new TestEmployee();
    }
}
