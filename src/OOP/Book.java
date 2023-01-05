package OOP;

public class Book {
    private int code;
    private String title;
    private String author;
    private int year;

    public void setCode(int code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYear(int year){
        this.year= year;
    }
    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    public int getYear(){
        return year;
    }

    public Book() {
        code = 1010;
        title = "C++ Programming";
        author = "Chan Dara";
        year = 2022;
    }

    public Book(int code, String title, String author,int year) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void disPlay() {
        System.out.println("Code = " + code + " ,Title = " + title + " ,Author by " + author+ " ,Year = "+year);
    }


    @Override
    public String toString() {
        return "Book{" +
                "code=" + code +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
    public void Display(){
        System.out.println(toString());
    }
}
