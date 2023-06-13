package Searching.BinarySearch.LeetcodeQue;

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class MinimumInRBS {

    public int findMin(int[] nums) {
        return nums[findPivot(nums) +1];
    }

    int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(end > mid  && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(mid > start && nums[mid-1] > nums[mid]){
                return mid-1;
            }

            if(nums[start] >= nums[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

}