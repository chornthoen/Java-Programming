package Inherritance2;

public class Product {
    private int code;
    private String name;

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Product(int code,String name){
        setCode(code);
        setName(name);
    }
    public String toString(){
        return "code :"+getCode()+" name :"+getName();

    }
}
