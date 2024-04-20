package Array;

public class ReverseArrayApproach2 {
    public static void main(String[] args) {
        int[] arr = {10,20, 30, 40, 50};
        display(arr);
        reverse(arr);
        display(arr);
    }

    public static void reverse(int[] arr)
    {
        int i = 0; int j = arr.length - 1;
        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void display(int[] arr) {
        System.out.println("Elements in reverse order");
        for (int ele: arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
