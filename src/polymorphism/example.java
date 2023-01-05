package polymorphism;

public class example {
    public void example_1(){
        System.out.println("This is one");
    }
}
class two extends example{
    @Override
    public void example_1(){
        System.out.println("This is two");
    }
}
class tree extends example{
    @Override
    public void example_1() {
        System.out.println("This is tree");
    }
}
class main{
    public static void main(String[] args) {
        example example = new example();
        example my2 = new two();
        example my3 = new tree();
        example.example_1();
        my2.example_1();
        my3.example_1();

    }
}

