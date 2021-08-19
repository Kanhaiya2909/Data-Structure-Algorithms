package _10Matrix;

public class _04SparseMatrix {

	public static void main(String[] args) {


		 int[][] sparseMatrix = {{1,0,7,0},
		                         {3,0,0,0},
		                         {2,0,0,0},
		                         {7,0,0,0}};
		            int size = 0;
		            for (int i = 0; i < sparseMatrix.length; i++) {
		                for (int j = 0; j < sparseMatrix[i].length; j++) {
		                    if (sparseMatrix[i][j] !=0) {
		                        size++;
		                    }
		                }
		            }


		            int[][] compactMatrix = new int[3][size];
		            int k = 0;
		               for (int i = 0; i < sparseMatrix.length; i++) {
		                for (int j = 0; j < sparseMatrix[i].length; j++) {
		                    if (sparseMatrix[i][j] != 0){
		                        compactMatrix[0][k] = i;
		                        compactMatrix[1][k] = j;
		                        compactMatrix[2][k] = sparseMatrix[i][j];
		                        k++;
		                    }
		                }
		            }
		               for (int i =0; i< compactMatrix.length; i++){
		                   for (int j =0; j<size; j++){
		                       System.out.print(compactMatrix[i][j]+ " ");
		                   }
		                   System.out.println();
		               }
		        }
}
