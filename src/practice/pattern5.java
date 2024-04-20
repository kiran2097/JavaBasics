package practice;

public class pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int totalStars = (2*n) - 1;
        int firstStars = n;
        int secondStars = totalStars - firstStars;
        int rowSpace = 0;
        for (int i = n; i >= 1; i--) {
            for(int firstsec = 1; firstsec <= firstStars; firstsec++) {
                System.out.print("*");
            }
            for(int space = 1; space <= rowSpace; space++) {
                System.out.print(" ");
            }
            for (int secondSec = 1; secondSec <= secondStars; secondSec++) {
                System.out.print("*");
            }
            System.out.println();
            firstStars = i - 1;
            secondStars = i - 1;
            rowSpace = totalStars - (firstStars + secondStars);
        }
    }
}
