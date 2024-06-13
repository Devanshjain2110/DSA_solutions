package Searching.BinarySearch2D.LeetcodeQue;
// https://leetcode.com/problems/search-a-2d-matrix/
public class Search2DMatrix {
    public static void main(String[] args) {

    }
 static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            int midVal = matrix[mid/cols][mid%cols];

            if(midVal > target){
                end = mid - 1;
            } else if (midVal < target){
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
