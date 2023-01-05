package abstract_class_employee;

public class Sale extends Employee {
    private double base;
    private double amount;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Sale() {
        super();
        base = 200;
        amount = 300;

    }

    public Sale(int id, String name, double base, double amount) {
        super(id, name);
        setBase(base);
        setAmount(amount);
    }

    @Override
    public double getSalary() {
        return getBase() + (getAmount() * 0.3);
    }

    @Override
    public double getTax() {
        return getAmount() * 0.3 * 0.15;
    }

    @Override
    public double getIncome() {
        return getSalary()-getTax();
    }

    public String toString() {
        return "Sale: "+super.toString() + " ,Base=" + getBase() + " ,Amount ="
                + getAmount() + " ,Salary=" + getSalary() + " ,Tax =" + getTax()+" ,Income ="+getIncome();
    }
}
