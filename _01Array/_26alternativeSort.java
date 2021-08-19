package _01Array;

import java.util.Arrays;

/*
 * Given an array of integers, print the array in such a way 
 * that the first element is first maximum and second element is first minimum and so on.
 */
public class _26alternativeSort {

	static void alternateSort(int arr[], int n) {
        Arrays.sort(arr);
        int i = 0, j = n-1;
        while (i < j) {
            System.out.print(arr[j--] + " ");
            System.out.print(arr[i++] + " ");
        }
        if (n % 2 != 0)
            System.out.print(arr[i]);
    }
    public static void main (String[] args)
    {
        int arr[] = {1, 12, 4, 6, 7, 10};
        int n = arr.length;
        alternateSort(arr, n);
    }
}
