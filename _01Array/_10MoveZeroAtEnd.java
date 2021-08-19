package _01Array;

public class _10MoveZeroAtEnd {
	public static void moveZero(int[] arr) {
		int j= 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] !=0 && arr[j] ==0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] !=0) {
				j++;
			}
		}
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {0,0,4,0,6,0,30,20};
		moveZero(arr);
		printArray(arr);
	}

}
