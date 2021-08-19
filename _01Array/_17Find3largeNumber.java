package _01Array;

import java.util.Arrays;

public class _17Find3largeNumber {

    void find3largest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int check = 0, count = 1;
        for (int i = 1; i <= n; i++) {
            if (count < 4) {
                if (check != arr[n - i]) {
                    System.out.print(arr[n - i] + " ");
                    check = arr[n - i];
                    count++;
                }
            }
            else
                break;
        }
    }
    public static void main(String[] args){
      _17Find3largeNumber   obj = new _17Find3largeNumber();
        int[] arr = { 12, 45, 1, -1, 45, 54,54, 23, 5, 0, -10 };
        obj.find3largest(arr);
    }

}
