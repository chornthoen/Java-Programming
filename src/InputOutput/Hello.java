package InputOutput;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String number;
        char ch;
        String result="";
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Number:");
        number=in.next();
        for(int i=0;i<number.length();i++) {
            ch=number.charAt(i);
            switch (ch) {
                case '0' -> result += " Zero ";
                case '1' -> result += " One ";
                case '2' -> result += " Two ";
                case '3' -> result += " Three ";
                case '4' -> result += " Four ";
                case '5' -> result += " Five ";
                case '6' -> result += " Six ";
                case '7' -> result += " Seven ";
                case '8' -> result += " Eight ";
                case '9' -> result += " Nine ";

            }

        }
        System.out.println(result);

    }
}
