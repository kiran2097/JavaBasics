package L3;


import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int a =obj.nextInt();
        if(a%2 == 0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}
