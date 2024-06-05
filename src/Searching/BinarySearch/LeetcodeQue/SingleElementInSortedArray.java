package Searching.BinarySearch.LeetcodeQue;

// https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// redid
public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start <end){
            int mid = start + (end - start)/2;
            boolean isEven = mid%2==0;

            if(isEven){
                if(nums[mid] == nums[mid+1]){
                    start = mid+2;
                }else{
                    end = mid;
                }
            } else {
                if(nums[mid] == nums[mid-1]){
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return nums[start];
    }
}
