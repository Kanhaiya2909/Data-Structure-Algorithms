package _10Matrix;

public class _03RotateMatrix180 {

	 static int N = 3;
     static void rotateMatrix(int mat[][]) {
         for (int i = N - 1; i >= 0; i--) {
             for (int j = N - 1; j >= 0; j--)
                 System.out.print(mat[i][j] + " ");
             System.out.println();
         }
     }
     public static void main(String[] args) {
         int[][] mat = { { 1, 2, 3 },
                         { 4, 5, 6 },
                         { 7, 8, 9 } };

         rotateMatrix(mat);
     }
}
