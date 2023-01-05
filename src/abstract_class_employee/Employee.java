package abstract_class_employee;

abstract public class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Employee(){
        id= 1;
        name = "chan dara";
    }
    public Employee(int id,String name){
        setId(id);
        setName(name);
    }
    public abstract double getSalary();
    public abstract double getTax();
    public abstract double getIncome();

    public String toString() {
        return "ID =" + id +", Name =" + name;
    }
}
