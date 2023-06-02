package Searching.BinarySearch2D;

import java.util.Arrays;
// This is a rowwise and column wise sorted matrix
public class BinarySearch {
    public static void main(String[] args) {
        int[][] soro = {
            {2, 4, 6, 14},
            {5, 8, 9, 17},
            {10, 14, 15, 20}
        };
        System.out.println(Arrays.toString(search(soro, 9)));
    }

    static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length;

        while(r < matrix.length && c >=0  ){
            if(matrix[r][c] == target){
                return new int[] {r,c};
            }

            if(matrix[r][c] > target){
                c--;
            }else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}
