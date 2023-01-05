package InputOutput;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String gender;
        int age;
        double height;
        String classs;
        int year;
        System.out.print("Enter name : ");
        name = scanner.nextLine();
        System.out.print("Enter gender:");
        gender = scanner.next();
        System.out.print("Enter age:");
        age = scanner.nextInt();
        System.out.print("Enter height");
        height = scanner.nextDouble();
        System.out.print("Enter class");
        classs= scanner.next();
        System.out.print("Enter year:");
        year = scanner.nextInt();
        System.out.println("-----------------------------");
        System.out.println("My name is "+name);
        System.out.println("Gender "+gender);
        System.out.println("I'm "+age+ " years old!");
        System.out.println("I am is height "+height+" cm");
        System.out.println("Study room is "+classs);
        System.out.println("I'm study year "+year);



    }
}
