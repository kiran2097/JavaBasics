package L3;

import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter  sides of triangle");
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        if (a == 0 || b == 0 || c == 0)
            System.out.println("Invalid Trianle");
        else
        {
            if( a == b && a == c)
            {
                System.out.println("Equilateral Triangle");
            }
            else if ((a==b) || (b==c) || (a == c))
                System.out.println("Isosceles Triangle");
            else {
                System.out.println("Scalene Triangle");
            }
        }
    }
}
