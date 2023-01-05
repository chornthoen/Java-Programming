package polymorphism;

public class Student extends Person {
    private int id;
    private String gruop;
    private int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGruop() {
        return gruop;
    }

    public void setGruop(String gruop) {
        this.gruop = gruop;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student() {
        super();
        id = 1;
        gruop = "A5";
        year = 2022;
    }

    public Student(int id, String firsName, String lastName, String gruop, int year) {
        super(firsName, lastName);
        setId(id);
        setGruop(gruop);
        setYear(year);
    }

    public String toString() {
        String st = super.toString();
        return "ID: " + getId() + " ," + st + " ,Group: " + getGruop() + " ,Year: " + getYear();
    }

    public void displayStudent() {
        System.out.println(toString());

    }
}
