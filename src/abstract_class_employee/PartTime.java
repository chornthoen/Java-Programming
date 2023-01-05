package abstract_class_employee;

public class PartTime extends Employee {
    private double hour;
    private double rate;

    public double getHour() {
        return hour;
    }

    public void setHoue(double hour) {
        this.hour = hour;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public PartTime(){
        super();
        hour= 100;
        rate= 50;
    }
    public PartTime(int id,String name,double hour,double rate){
        super(id,name);
        setHoue(hour);
        setRate(rate);
    }

    @Override
    public double getSalary() {
        return getHour()*getRate();
    }

    @Override
    public double getTax() {
        return getSalary()*0.1;
    }

    @Override
    public double getIncome() {
        return getSalary()-getTax();
    }

    public String toString(){
        return "Part Time: "+ super.toString()+" ,Hour= "+getHour()+" ,Rate= "
                +getRate()+" ,Salary= "+getSalary()+" ,Tax= "+getTax()+" ,Income ="+getIncome();
    }
}
