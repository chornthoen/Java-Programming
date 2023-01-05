package Inherritance;

public class Computer extends Product{
    int id;
    String model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Computer(int id, String name, String model, int year){
        this.id= id;
        this.name = name;
        this.model = model;
        this.year= year;
    }
    public Computer(){
        id=101;
        name="MacOS";
        model="M2";
        year=2022;
    }
    public void Display(){
        System.out.println("ID ="+id+" ,Product Name ="+name+" ,Model ="+model+" ,Year ="+year);
    }

}
