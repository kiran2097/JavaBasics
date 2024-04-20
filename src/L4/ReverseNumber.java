package L4;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int r=0, d;
        while(n > 0)
        {
            d = n % 10;
            r = r * 10 + d;
            n = n /10;
        }
        System.out.println("Reversed Number " + r);
    }
}
