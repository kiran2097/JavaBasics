package practice;

public class pattern6 {
    public static void main(String[] args) {

        //*   *
        //** **
        //*****
        //** **
        //*   *
        int n = 5;
        int totalStars = (2*n) - 1;
        int firstStars = 1;
        int secondStars = 1;
        int rowSpace = (n - 2);
        for (int i = 1; i <= n; i++) {
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
            if (i > (n/2)) {
                rowSpace += 2;
                firstStars--;
                secondStars = n - (firstStars + rowSpace);
            }
            else {
                rowSpace -= 2;
                firstStars++;
                if (rowSpace < 0)
                secondStars = n - (firstStars);
                else
                    secondStars = n - (firstStars + rowSpace);

            }


//            System.out.println("i " + i + " first " + firstStars + " space " + rowSpace + " second " + secondStars);

            }
        }
}
