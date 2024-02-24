package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class FirstAndLastPosition {



    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        String x = Arrays.toString(searchRange(nums, target));
        System.out.println(x);
    }

    static int[] searchRange(int[] nums, int target) {

        int first = binarySearch(nums, 0, nums.length-1, false,target);
        int end = binarySearch(nums, 0, nums.length-1, true, target);

        return new int[] {first, end};
    }

    static int binarySearch(int[] arr,int start,int end, boolean isLast, int target){

        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            } else if(arr[mid] < target){
                start = mid+1;
            } else {
                ans = mid;
                if(isLast){
                    start = mid + 1;
                } else {
                    end = mid-1;
                }
            }

        }
        return ans;
    }
}
