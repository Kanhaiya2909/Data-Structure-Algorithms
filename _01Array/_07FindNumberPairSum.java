package _01Array;

public class _07FindNumberPairSum {
	public static void findPair(int[] A, int sum) {
	for (int i = 0; i < A. length - 1; i++)
		for (int j = i + 1; j < A. length; j++)
	
			if (A[i] + A[j] == sum)
	
				System. out. println("Pair found (" + A[i] + ", " + A[j] + ")");
	}
	
	
	
	public static void main (String[] args){
		int[] A = { 8, 7, 2, 5, 3, 1, 4};
		findPair(A, 9);
		
	}

}
