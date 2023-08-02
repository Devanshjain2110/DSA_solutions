package Searching.BinarySearch.LeetcodeQue;

// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(findElement(nums));
    }

    static int findElement(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid =start + (end-start)/2;

            if( ( mid%2==0 && arr[mid] == arr[mid+1] ) || ( mid%2==1 && arr[mid] == arr[mid-1] )){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return arr[start];
    }
}
