package OOP;

public class mainApp {
    public static void main(String[] args) {
        Book book = new Book();
        book.Display();
        Book book1 = new Book(10,"Database","Sok heng",2022);
        book1.Display();

        person p = new person("Chorn Thoen",19,1.65);
        p.display();

    }
}
