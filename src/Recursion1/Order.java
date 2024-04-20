package Recursion1;

public class Order {

    public static void main(String[] args) {
        increasingDecreasingOrder(6, 6);
    }

    public static void increasingDecreasingOrder(int n, int o) {
        if (o == (n-2))
            return;
        if ( o < 0) {
            increasingDecreasingOrder(n, 2);
        }
        if (n == o && n % 2 == 0) {
            System.out.println(o-1);
            increasingDecreasingOrder(n, o-1);
        }
        if( o % 2 == 0) {
            System.out.println(o);
            increasingDecreasingOrder(n, o + 2);
        }
        else {
            System.out.println(o);
            increasingDecreasingOrder(n, o - 2);
        }
    }
}
