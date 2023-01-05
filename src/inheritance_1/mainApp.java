package inheritance_1;

public class mainApp {
    public static void main(String[] args) {
        Employee employee = new Employee(101, "Chan", "Dara", 22, 30, 400);
        employee.displayEmployee();

        Student student = new Student("John", "Smith", 19, "Male", "A5", 2022);
        student.displayStudent();

        Teacher teacher = new Teacher("Long","Heng",40,"Java","database",500);
        teacher.displayTeacher();

    }
}
