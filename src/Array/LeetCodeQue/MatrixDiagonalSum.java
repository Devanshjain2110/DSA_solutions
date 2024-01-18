package Array.LeetCodeQue;
// https://leetcode.com/problems/matrix-diagonal-sum/description/
public class MatrixDiagonalSum {
    public static void main(String[] args) {

    }
// redid
    static int diagonalSum(int[][] mat) {
        boolean isEven = mat.length%2 == 0;
        int sum = 0;
        if(isEven){
            for(int i = 0; i < mat.length; i++){
                sum += mat[i][i];
            }
            for(int j = mat.length-1; j >= 0; j--){
                sum +=mat[j][mat.length-1-j];
            }
        }else{
            for(int i = 0; i < mat.length; i++){
                sum += mat[i][i];
            }
            for(int j = mat.length-1; j >= 0; j--){
                if(j != mat.length/2){
                    sum +=mat[j][mat.length-1-j];
                }
            }
        }
        return sum;
    }
}
