package _01Array;
//example of 2D array

public class _03_2DArray {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{4,9,6}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
