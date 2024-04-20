package L4;

import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int power = 1;
        for ( int i = 1; i <= b; i++)
        {
            power = power * a;
        }
        System.out.println(power);
    }
}
