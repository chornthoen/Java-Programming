package example_inheritance;

public class Product {
    private int code;
    private String name;
    public Product() {
        code = 1;
        name = "Cocacola";
    }
    public Product(int code, String name) {
        setCode(code);
        setName(name);
    }
    //accessor
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

    public String toString() {
        return "Code: "+getCode()+" ,Name: " + getName();
    }

}
