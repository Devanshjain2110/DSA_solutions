package Searching.BinarySearch2D.LeetcodeQue;
// https://leetcode.com/problems/find-a-peak-element-ii/
public class PeakElement2 {
    public static void main(String[] args) {

    }

    static int[] findPeakGrid(int[][] mat) {
        int cols = mat[0].length;
        int rows = mat.length;

        int start = 0;
        int end = cols-1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            int high = findHighestInMid(mat, mid, rows);

            int before = mid-1 >= 0 ? mat[high][mid-1] : -1;
            int after = mid+1 < cols ? mat[high][mid+1] : -1;

            if(mat[high][mid] > before && mat[high][mid] > after){
                return new int[]{high, mid};
            } else if (mat[high][mid] < before){
                end = mid - 1;
            }else {
                start = mid+ 1;
            }
        }
        return new int[]{-1,-1};
    }



    static int findHighestInMid(int[][] mat,int mid,int rows){
        int max = -1;
        int index = -1;
        for(int i = 0; i < rows; i++){
            if(mat[i][mid] > max){
                max = mat[i][mid];
                index = i;
            }
        }
        return index;
    }
}
