package Array.LeetCodeQue;
// https://leetcode.com/problems/transpose-matrix/
public class TransposeOfMatrix {
    public static void main(String[] args) {

    }
  static int[][] transpose(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] transposedMatrix = new int[m][n];

        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                transposedMatrix[i][j] = matrix[j][i];

        return transposedMatrix;
    }

}
