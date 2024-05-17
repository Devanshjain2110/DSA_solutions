package Array.LeetCodeQue2D;

// https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
// Redid it

public class MatByRotation {
    public static void main(String[] args) {

    }
  static boolean findRotation(int[][] mat, int[][] target) {
        int Rot90=0,Rot180=0,Rot270=0,Rot0 = 0;
        int len = target.length;

        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++){

                if(target[i][j] == mat[len-j-1][i]) Rot90++;

                if(target[i][j] == mat[len-i-1][len-j-1]) Rot180++;

                if(target[i][j] == mat[j][len-i-1]) Rot270++;

                if(target[i][j] == mat[i][j]) Rot0++;
            }
        }

        return ( Rot90 == len*len || Rot180 == len*len || Rot270 == len*len || Rot0 == len*len );

    }
}
