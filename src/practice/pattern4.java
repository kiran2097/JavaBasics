package practice;

public class pattern4 {

    public static void main(String[] args) {


        int n = 7;
        int stars = 1;
        int rowspace = n/2;
        for (int i = 1; i <= n; i++) {
            for(int space = 1; space <= rowspace; space++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i>=(n+1)/2)
            {
                rowspace += 1;
                stars -=2;
            }
            else {
                rowspace -= 1;
                stars +=2;
            }
        }
    }
}
