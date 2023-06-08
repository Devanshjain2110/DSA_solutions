package Searching.LinearSearch.NonLeetCodeQue;

import java.util.Arrays;

public class Array2D_Linear_Search {
    public static void main(String[] args) {
        int[][] arr1 = {
                {4,5,6},
                {34,56,2},
                {3,98,78,67}
        };
        int[] ans = search(arr1, 98);
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int[][] arr, int target) {
        if(arr.length == 0){
            return new int[] {-1,-1};
        }

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[] {row, col};
                }
            }
        }

        return new int[] {-1,-1};
    }
}
