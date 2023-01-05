package Function;


import OOP.Book;

public class function {


    public static void main(String[] args) {
        Teacher();
        Student("Chorn Thoen", 19, "Male");
        System.out.println(name());
        System.out.println(sum(10,20));
    }
    //function no return
    static void  Teacher(){
        System.out.println("Chan Dara");
    }
    // function have parameter no return
    static void Student(String name, int age, String gender) {
        System.out.println("My name is " + name + " I'm " + age + " years old" + " " + gender);
    }
    //function no parameter but return
    static String name(){
        return "Chorn Thoen";
    }
    //function with parameter and return
    static int sum(int a,int b){
        return a+b;
    }

}
