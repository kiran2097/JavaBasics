package L4;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int min = 9, max = 0, d;
        while (n > 0)
        {
            d = n % 10;
            if (d > max)
                max = d;
            if (d < min)
                min = d;
            n /= 10;
        }
        System.out.println(min + " " + max);
    }
}
