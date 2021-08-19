package _01Array;
/*
 * Given an array of size N which is initialized with all zeros. 
 * We are given many ranges add queries, which should be applied to this array.
 *  We need to print the final updated array as our result. 
 */
public class _21ConstantTimeAddOperation {

	  static void add(int arr[], int N, int lo, int hi, int val) {
          arr[lo] += val;
          if (hi != N - 1)
              arr[hi + 1] -= val;
      }
      static void updateArray(int arr[], int N) {
          for (int i = 1; i < N; i++)
              arr[i] += arr[i - 1];
      }
      static void printArr(int arr[], int N) {
          updateArray(arr, N);
          for (int i = 0; i < N; i++)
              System.out.print("" + arr[i] + " ");
          System.out.print("\n");
      }
      public static void main(String[] args) {
          int N = 6;
          int arr[] = new int[N];
          add(arr, N, 0, 2, 100);
          add(arr, N, 1, 5, 100);
          add(arr, N, 2, 3, 100);
          printArr(arr, N);
      }
}
