package _01Array;
// example of Method can use array

public class _04MethodUsingArray {
	public static void calculate(int[] arr) {
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("The sum of all element of array is : "+ sum);
	}
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		calculate(arr);
	}

}
