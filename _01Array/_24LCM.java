package _01Array;

public class _24LCM {
	 static final int MAX = 1000;
     static int tree[] = new int[4 * MAX];
     static int arr[] = new int[MAX];
     static int gcd(int a, int b) {
         if (a == 0) {
             return b;
         }
         return gcd(b % a, a);
     }
     static int lcm(int a, int b) {
         return a * b / gcd(a, b);
     }
     static void build(int node, int start, int end) {
         if (start == end) {
             tree[node] = arr[start];
             return;
         }
         int mid = (start + end) / 2;
         build(2 * node, start, mid);
         build(2 * node + 1, mid + 1, end);
         int left_lcm = tree[2 * node];
         int right_lcm = tree[2 * node + 1];
         tree[node] = lcm(left_lcm, right_lcm);
     }
     static int query(int node, int start, int end, int l, int r) {
         if (end < l || start > r) {
             return 1;
         }
         if (l <= start && r >= end) {
             return tree[node];
         }
         int mid = (start + end) / 2;
         int left_lcm = query(2 * node, start, mid, l, r);
         int right_lcm = query(2 * node + 1, mid + 1, end, l, r);
         return lcm(left_lcm, right_lcm);
     }
     public static void main(String[] args) {
         arr[0] = 5;
         arr[1] = 7;
         arr[2] = 5;
         arr[3] = 2;
         arr[4] = 10;
         arr[5] = 12;
         arr[6] = 11;
         arr[7] = 17;
         arr[8] = 14;
         arr[9] = 1;
         arr[10] = 44;

         // build the segment tree
         build(1, 0, 10);

         // Now we can answer each query efficiently
         // Print LCM of (2, 5)
         System.out.println(query(1, 0, 10, 2, 5));

         // Print LCM of (5, 10)
         System.out.println(query(1, 0, 10, 5, 10));

         // Print LCM of (0, 10)
         System.out.println(query(1, 0, 10, 0, 10));

     }

}
