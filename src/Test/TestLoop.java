package Test;

public class TestLoop {
    public static void main(String[] args) {
        //Prints "All numbers are equal" if all three numbers are equal

        int num1 = 10;
        int num2 = 10;
        int num3 = 10;
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        }

        //Prints "All numbers are different" if all three numbers are different.
        int num4 = 10;
        int num5 = 20;
        int num6 = 30;
        if (num4 != num5 && num5 != num6 && num4 != num6) {
            System.out.println("All numbers are different");
        }
        //Prints "There is a different number" if two numbers are the same and one is different .

        int num7 = 10;
        int num8 = 10;
        int num9 = 30;
        if (num7 == num8 && num8 != num9) {
            System.out.println("There is a different number");
        }


    }
}
