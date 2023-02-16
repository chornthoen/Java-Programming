package inheritance_1;

public class Employee extends Person {
    private int  id;
    private double hour;
    private double rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Employee(int id, String firstName, String lastName,int age, double hour, double rate){
        super(firstName,lastName,age);
        setId(id);
        setHour(hour);
        setRate(rate);

    }
    public double getSalary(){
        return getHour()*getRate();
    }
    public String toString(){
        return "ID: "+getId()+" ,"+ super.toString()+
                " ,"+"Hour: "+getHour()+" ,Rate: "+getRate()+
                " ,Salary: "+getSalary();
    }
    public void displayEmployee(){
        System.out.println(this);
    }
}
