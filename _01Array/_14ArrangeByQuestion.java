package _01Array;
/*
Segregate even and odd numbers 
 */
public class _14ArrangeByQuestion {

	public static void arrayEvenAndOdd(int arr[], int n)
	{
	    int[] a;
	    a = new int[n];
	    int ind = 0;
	    for (int i = 0; i < n; i++)
	    {
	        if (arr[i] % 2 == 0)
	        {
	            a[ind] = arr[i];
	            ind++;
	        }
	    }
	    for (int i = 0; i < n; i++)
	    {
	        if (arr[i] % 2 != 0)
	        {
	            a[ind] = arr[i];
	            ind++;
	        }
	    }
	    for (int i = 0; i < n; i++)
	    {
	        System.out.print(a[i] + " ");
	    }
	    System.out.println("");
	}
	    // Driver code
	    public static void main (String[] args)
	    {
	       
	      int arr[] = { 1, 3, 2, 4, 7, 6, 9, 10 };
	            int n = arr.length;
	 
	            // Function call
	            arrayEvenAndOdd(arr, n);
	    }
}
