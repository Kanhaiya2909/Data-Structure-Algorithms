package _01Array;
//Example of Cloning Of Array


/* What is Clone?
-->Object cloning refers to the creation of an exact copy of an object.
	   It creates a new instance of the class of the current object and
	   initializes all its fields with exactly the contents of the 
	   corresponding fields of this object. Using Assignment Operator 
	   to create a copy of the reference variable.
 */
public class _05Clonning {
	public static void main(String[] args) {
		int[][] arr = {{2,3,3},{4,5,6}};
		int[][] cloneArray = arr.clone();
		
		    System.out.println(arr == cloneArray);
	        System.out.println(arr[0] == cloneArray[0]);
	        System.out.println(arr[1] == cloneArray[1]);
	        
	        
	        
		
		for (int i = 0; i < cloneArray.length; i++) {
			for (int j = 0; j < cloneArray[i].length; j++) {
				System.out.print(cloneArray[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
