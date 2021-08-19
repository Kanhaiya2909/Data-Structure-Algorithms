package _01Array;
// Write a function rotate(array[], d, n) that rotates array[] of size n by d elements. 

public class _06RotateArrayByGiven {
	 void leftRotate(int arr[], int d, int n){
	        for (int i = 0; i < d; i++)
	            leftRotatebyOne(arr, n);
	    }
	    void leftRotatebyOne(int arr[], int n){
	        int i, temp;
	        temp = arr[0];
	        for (i = 0; i < n - 1; i++)
	            arr[i] = arr[i + 1];
	        arr[n-1] = temp;
	    }
	    void printArray(int arr[]){
	        for (int i = 0; i < arr.length; i++)
	            System.out.print(arr[i] + " ");
	    }
	    public static void main(String[] args)
	    {
	        _06RotateArrayByGiven rotate = new _06RotateArrayByGiven();
	        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	        rotate.leftRotate(arr, 3, 7);
	        rotate.printArray(arr);
	    }
	    
//	    Time complexity : O(n * d) 
//	    Auxiliary Space : O(1)

}
