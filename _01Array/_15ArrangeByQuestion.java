package _01Array;
/*
  Positive elements at even and negative at odd positions (Relative order not maintained)
 */
public class _15ArrangeByQuestion {


    static void rearrange(int a[], int size){
        int positive = 0, negative = 1, temp;

        while (true) {
            while (positive < size && a[positive] >= 0)
                positive += 2;
            while (negative < size && a[negative] <= 0)
                negative += 2;
            if (positive < size && negative < size) {
                temp = a[positive];
                a[positive] = a[negative];
                a[negative] = temp;
            }
            else
                break;
        }
    }
    public static void main(String args[]) {
        int arr[] = {1, -3, -5, -6, -3, 6, 7, 4, -9, -10};
        int n = arr.length;

        rearrange(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
