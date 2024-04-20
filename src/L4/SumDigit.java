package L4;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d, sum_odd = 0, sum_even = 0;
        while(n > 0)
        {
            d = n % 10;
            if (d % 2 == 0)
            {
                sum_even += d;
            }
            else
            {
                sum_odd += d;
            }
            n /= 10;
        }
        System.out.println(sum_odd + " " +  sum_even);
    }
}
