package Array.LeetCodeQue;

import java.util.Arrays;

// https://leetcode.com/problems/transpose-matrix/
public class TransposeOfMatrix {
    public static void main(String[] args) {
int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(mat)));
    }
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] res = new int[cols][rows];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                res[j][i]=matrix[i][j];
            }
        }

        return res;
    }
}

