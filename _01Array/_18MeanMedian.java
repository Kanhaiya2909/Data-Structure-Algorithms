package _01Array;
// find mean and median

import java.util.Arrays;

public class _18MeanMedian {
    public double mean(int[] arr, int n){
        int sum = 0;
        for (int i=0; i< arr.length; i++){
            sum += arr[i];
        }
            return (double)sum/(double)n;
    }
    public double median(int[] arr, int n){
        Arrays.sort(arr);
        if (n%2 == 0){
            return (double) (arr[(n-1)/2]+arr[n/2])/2.0;
        }else {
            return (double) arr[n/2];
        }
    }

    public static void main(String[] args) {
        _18MeanMedian meanMedian = new _18MeanMedian();
        int[] arr = {1,3,2,5,4,7,6,8};
        System.out.println("mean : "+ meanMedian.mean(arr, arr.length));
        System.out.println("median : "+ meanMedian.median(arr, arr.length));
    }
}

