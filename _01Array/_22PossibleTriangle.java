package _01Array;
/*
 * We know that sum of  length of any two side of triangle is must be greater then third one.
 */
public class _22PossibleTriangle {
	 static int findNumberOfTriangles(int arr[], int n) {
         int count = 0;
         for (int i = 0; i < n; i++) {
             for (int j = i + 1; j < n; j++) {
                 for (int k = j + 1; k < n; k++)
                     if (
                             arr[i] + arr[j] > arr[k]
                                     && arr[i] + arr[k] > arr[j]
                                     && arr[k] + arr[j] > arr[i])
                         count++;
             }
         }
         return count;
     }
     public static void main(String[] args)
     {
         int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
         int size = arr.length;

         System.out.println( "Total number of triangles possible is "+
                 findNumberOfTriangles(arr, size));
     }

}
