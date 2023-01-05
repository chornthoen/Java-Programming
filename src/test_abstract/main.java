package test_abstract;

public class main {
    public static void main(String[] args) {
        Khmer khmer = new Khmer();
        China china = new China();
        USA usa = new  USA();
        System.out.println(khmer.message());
        System.out.println(china.message());
        System.out.println(usa.message());

    }
}
