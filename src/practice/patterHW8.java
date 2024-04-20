package practice;

public class patterHW8 {
    public static void main(String[] args) {
        // *********
        // *******
        // *****
        // ***
        // *
        int n =5, i , j, noOfStars = 2 * n - 1;
        for(i = n; i >= 1; i--) {
            for(j = 1; j <= noOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
            noOfStars -= 2;
        }
    }
}
