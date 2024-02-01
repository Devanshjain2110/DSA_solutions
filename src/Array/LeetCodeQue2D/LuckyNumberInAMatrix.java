package Array.LeetCodeQue2D;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }

    static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> Lucky = new ArrayList<Integer>();

        int big, small;
        for(int i = 0; i < matrix.length; i++){
            int col = 0;
            small = Integer.MAX_VALUE;

            for(int j = 0; j < matrix[0].length; j++){
                if(small > matrix[i][j]){
                    small = matrix[i][j];
                    col = j;
                }
            }
            big = small;
            for(int x = 0; x < matrix.length; x++){
                if(big < matrix[x][col]){
                    big = matrix[x][col];
                }
            }
            if(big == small){
                Lucky.add(big);
            }

        }
        return Lucky;
    }
}
