package Inherritance;

public class mainApp {
    public static void main(String[] args) {
//        Employee employee = new Employee(101,"Chan","Dara",22,13);
//        employee.sayHello();
//        employee.Display();


        Computer computer = new Computer();
        computer.Display();
        Computer computer1 = new Computer(111,"MacBook pro","M2",2022);
        computer1.Display();

    }
}
