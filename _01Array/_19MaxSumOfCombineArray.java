package _01Array;

import java.util.Collections;
import java.util.PriorityQueue;

/*
Given two equally sized arrays (A, B) and N (size of both arrays). 
A sum combination is made by adding one element from array A
 and another element of array B. Display the maximum K valid sum
  combinations from all the possible sum combinations. 
*/
public class _19MaxSumOfCombineArray {

	 static void KMaxCombinations(int A[], int B[], int N, int K) {
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
                 Collections.reverseOrder());
         for (int i = 0; i < N; i++)
             for (int j = 0; j < N; j++)
                 pq.add(A[i] + B[j]);
         int count = 0;
         while (count < K) {
             System.out.println(pq.peek());
             pq.remove();
             count++;
         }
     }
     public static void main(String[] args)
     {
         int A[] = { 4, 2, 5, 1 };
         int B[] = { 8, 0, 5, 3 };
         int N = A.length;
         int K = 3;
         KMaxCombinations(A, B, N, K);
     }
}
