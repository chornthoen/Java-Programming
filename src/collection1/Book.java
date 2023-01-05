package collection1;

public class Book {
    private int code;
    private String title;
    private double price;

    public Book(int code, String title, double price) {
        this.code = code;
        this.title = title;
        this.price = price;
    }

    public Book() {
        code = 1;
        title = "JAVA";
        price= 20.0;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}'+"\n";
    }
}
