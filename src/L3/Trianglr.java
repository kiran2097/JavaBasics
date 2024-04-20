package L3;

import java.util.Scanner;

public class Trianglr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 angles of triangle");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        if(a <= 0 || b <= 0  || c <= 0)
            System.out.println("Invalid Angle");
        else if(a+b+c == 180)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}
