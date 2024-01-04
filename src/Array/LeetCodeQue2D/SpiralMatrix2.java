package Array.LeetCodeQue2D;

import java.util.Arrays;

public class SpiralMatrix2 {

    // https://leetcode.com/problems/spiral-matrix-ii/description/
    public static void main(String[] args) {
int n = 4;
        System.out.println(Arrays.deepToString((generateMatrix(n))));
    }
    static int[][] generateMatrix(int n) {
        int [][] mat = new int[n][n];

        int rowStart = 0;
        int rowEnd = mat.length-1;
        int colStart = 0;
        int colEnd = mat[0].length-1;

        int num = 1;
        while(rowStart <= rowEnd && colStart <= colEnd){
            // Traverse Right
            for(int i = colStart; i <= colEnd; i++){
                mat[rowStart][i] = num;
                num++;
            }
            rowStart++;

            // Taverse Down
            for(int i = rowStart; i <= rowEnd; i++){
                mat[i][colEnd] = num;
                num++;
            }
            colEnd--;

            // Traverse Left
            if(rowStart <= rowEnd){
                for(int i = colEnd; i >= colStart; i--){
                    mat[rowEnd][i] = num;
                    num++;
                }
            }
            rowEnd--;

            // Traverse Up
            if(colStart <= colEnd){
                for(int i = rowEnd; i>=rowStart; i-- ){
                    mat[i][colStart] = num;
                    num++;
                }
            }
            colStart++;

        }
        return mat;
    }
}
