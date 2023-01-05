package lession;

public class main {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        System.out.println(computer1.ToString());
        Computer computer = new Computer(11,"Macbook M2",2000.00,2022);
        System.out.println(computer.ToString());
    }
}
