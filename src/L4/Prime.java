package L4;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int flag = 0;
        for(int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Not a prime number");
        else
            System.out.println("Prime number");
    }
}
