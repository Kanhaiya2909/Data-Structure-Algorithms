package _01Array;
// Find Kth smallest number?

import java.util.Arrays;

public class _16KthSmallest {


    public static int kthSmallest(Integer[] arr, int k)
    {
        Arrays.sort(arr);
        return arr[k - 1];
    }

    public static void main(String[] args)
    {
        Integer arr[] = new Integer[] { 12, 3, 5,8, 7, 19 };
        int k = 4;
        System.out.print("K'th smallest element is " + kthSmallest(arr, k));
    }

}
