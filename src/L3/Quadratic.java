package L3;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter values of a,b,c");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double root = Math.sqrt((b * b) - (4 * a * c));
        double first_root = (-b - root)/(2 * a);
        double second_root = (-b + root)/(2 * a);
        System.out.println("First root - " + first_root);
        System.out.println("Second root - " + second_root);
    }
}
