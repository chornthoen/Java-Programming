package abstract_class_employee;

public class FullTime extends Employee{
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public FullTime(){
        super();
        salary = 700;

    }
    public FullTime(int id,String name,double salary){
        super(id,name);
        setSalary(salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getTax() {
        return getSalary()*0.5;
    }

    @Override
    public double getIncome() {
        return getSalary()-getTax();
    }

    public String toString(){
        return  "Full Time:"+ super.toString()+" ,Salary = "+getSalary()+
                " ,Tax ="+getTax()+" ,Income ="+getIncome();
    }
}
