package polymorphism;

public class Person {
    private String firsName;
    private String lastName;

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Person(){
        firsName = "Chan";
        lastName = "Sok";
    }
    public Person(String firsName,String lastName){
        setFirsName(firsName);
        setLastName(lastName);
    }
    public String toString(){
        return "Name: "+getFirsName()+ " "+getLastName();
    }










}
