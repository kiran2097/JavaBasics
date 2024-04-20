package L3;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b && a >= c)
        {
            System.out.println("A is largest");
        }
        else if(b>= a && b >=c) {
            System.out.println("B is the largest");
        }
        else
        {
            System.out.println("C is the largest");
        }
    }
}
