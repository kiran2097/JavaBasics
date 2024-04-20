package practice;

public class pattern3 {

    public static void main(String[] args) {

        int n = 7;
        int stars = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
            if(i >= (n+1)/2){
                stars--;
            }
            else {
                stars++;
            }
        }
        }
}
