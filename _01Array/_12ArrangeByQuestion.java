package _01Array;

import java.util.Arrays;

/*
  Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements
   in “arr[]” according to given index array. It is not allowed to given array arr’s length.
 */
public class _12ArrangeByQuestion {
	static int[] arr = {89,96,45,67,83};
	static int[] index = {2,4,0,1,3};
	static void reorder() {
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[index[i]] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
			index[i] = i;
		}
	}
	public static void main(String[] args) {
		reorder();
		
		 System.out.println("Reordered array is: ");
         System.out.println(Arrays.toString(arr));
         System.out.println("Modified Index array is:");
         System.out.println(Arrays.toString(index));
	}
	

}
