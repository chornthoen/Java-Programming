package inheritance_1;

public class Teacher extends Person {
    private String subject1;
    private String subject2;
    private double salary;

    public void setSubject1(String subject1) {
        this.subject1 = subject1;
    }

    public String getSubject1() {
        return subject1;
    }

    public void setSubject2(String subject2) {
        this.subject2 = subject2;
    }

    public String getSubject2() {
        return subject2;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Teacher(String firstName,String lastName,int age,String subject1,String subject2,double salary){
        super(firstName,lastName,age);
        setSubject1(subject1);
        setSubject2(subject2);
        setSalary(salary);

    }
    public String toString(){
        return super.toString()+" ,subject 1: "+ getSubject1()+" ,subject 2: "+getSubject2()+" ,salary: "+getSalary();
    }
    public void displayTeacher(){
        System.out.println(toString());
    }


}
