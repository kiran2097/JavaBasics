package L4;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        char operator;
        do {
            System.out.println("Enter  a character and 2 integers and to exit enter 'x' or 'X");
            operator = scanner.next().charAt(0);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (operator == '+')
                System.out.println("Sum of " + a + " + " + b + " is " + (a+b));
            else if (operator == '*')
                System.out.println("Multiplication of " + a + " and " + b + " is " + (a*b));
            if (operator == '-')
                System.out.println("Subtraction of " + a + " - " + b + " is " + (a-b));
            if (operator == '/')
                System.out.println("Divison of " + a + " by " + b + " is " + (a/b));
        }while(operator != 'x' && operator != 'X');
    }
}
