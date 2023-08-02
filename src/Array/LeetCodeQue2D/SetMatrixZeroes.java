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
        int m = matrix.length;
        int n = matrix[0].length;
        boolean isRow0 = false;
        boolean  isCol0 = false;

        for(int i = 0; i < m; i ++){
            if(matrix[i][0] == 0){
                isCol0 = true;
            }
        }

        for(int j = 0; j< n; j++){
            if(matrix[0][j] == 0){
                isRow0 = true;
            }
        }

        for(int i = 1; i < m; i++ ){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0 ){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++ ){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0 ){
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < m; i++){
            if(isCol0){
                matrix[i][0] = 0;
            }
        }

        for(int j = 0; j < n; j++){
            if(isRow0){
                matrix[0][j] = 0;
            }
        }
    }
}

