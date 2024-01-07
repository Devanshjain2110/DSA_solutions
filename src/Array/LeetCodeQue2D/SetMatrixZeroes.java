package Array.LeetCodeQue2D;

// https://leetcode.com/problems/set-matrix-zeroes/description/

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
    int[][] mat =  {{1,1,1},{1,0,1},{1,1,1}};
    setZeroes(mat);
    for(int[] row : mat) {
        System.out.println(Arrays.toString(row));
    }
    }

    static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean isRow = false, isCol = false;

        for(int i = 0; i < n; i ++){
            if(matrix[i][0] == 0){
                isRow = true;
            }
        }
        for(int j = 0; j < m; j ++){
            if(matrix[0][j] == 0){
                isCol = true;
            }
        }

        for(int i =1; i < n; i ++){
            for(int  j = 1; j< m; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i =1; i < n; i ++){
            for(int  j = 1; j< m; j++){
                if(matrix[i][0] == 0 || matrix[0][j] ==0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(isRow) {
            for(int i = 0; i < n; i ++){
                matrix[i][0] = 0;
            }
        }

        if(isCol) {
            for(int j = 0; j < m; j ++){
                matrix[0][j] = 0;
            }
        }
    }
}

