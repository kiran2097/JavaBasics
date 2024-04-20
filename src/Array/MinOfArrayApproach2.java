package Array;

public class MinOfArrayApproach2 {
    public static void main(String[] args) {
        int[] arr = {75,67,23,87,12};
        int min = findMin(arr);
        System.out.println("Min element in arr  is " + min);
    }

    public static int findMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for (int ele: arr) {
            if(ele < min) {
                min = ele;
            }
        }
        return min;
    }
    public static void display(int[] arr) {
        System.out.println("Elements in reverse order");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
    }
}
