package _01Array;

import java.util.Arrays;

/*
  Given an array of integers, task is to print the array in the
   order – smallest number, Largest number, 2nd smallest number, 2nd largest number,
    3rd smallest number, 3rd largest number and so on…
 */
public class _11ArrangeByQuestion {
	public static void rearrangeArray(int[] arr, int n) {
		Arrays.sort(arr);
		int[] tempArray = new int[n];
		int arrayIndex = 0;
		for (int i = 0, j=n-1; i <= n/2 || j> n/2; i++, j--) {
			if (arrayIndex <n) {
				tempArray[arrayIndex] = arr[i];
				arrayIndex++;
				
			}
			if (arrayIndex <n) {
				tempArray[arrayIndex] = arr[j];
				arrayIndex++;
				
			}
		}
		for (int i = 0; i < tempArray.length; i++) {
			arr[i] =tempArray[i] ;
		}
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
//		_11ArrangeByQuestion byQuestion = new _11ArrangeByQuestion();
		int[] arr = {2,3,8,3,90,65,34};
		rearrangeArray(arr, arr.length);
		printArray(arr);
	}

}
