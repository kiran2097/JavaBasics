package Array;

public class MinOfArray {
    public static void main(String[] args) {
        int[] arr = {75,67,23,87,12};
        int min = findMin(arr);
        System.out.println("Min element in arr  is " + min);
    }

    public static int findMin(int[] arr)
    {
        int min = arr[0];
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
