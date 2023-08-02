package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/
public class RBSWithDuplicates {

    public static void main(String[] args) {

    }

    public boolean search(int[] nums, int target) {

        int Pivot = findPivot(nums);

        if(Pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }

        int start = 0;
        int end = nums.length-1;

        if(nums[Pivot] == target){
            return true;
        }

        if(nums[start] > target){
            return binarySearch(nums, target, Pivot+1, end);
        }

        return binarySearch(nums, target, start, Pivot);
    }

    int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end ){

            int mid = start + (end-start)/2;

            if( (end > mid)  && (nums[mid] > nums[mid+1]) ){
                return mid;
            }

            if( (mid > start)&& (nums[mid-1] > nums[mid]) ){
                return mid-1;
            }

            if( (nums[start] == nums[mid]) && (nums[mid] == nums[end]) ) {

                if( nums.length!=1  && nums[start] > nums[start+1]){
                    return start;
                }

                start++;

                if( nums.length>1 &&  nums[end-1] > nums[end]){
                    return end-1;
                }

                end--;
            }
            else if( nums[mid] > nums[start] || nums[start]==nums[mid] && nums[mid] > nums[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }

    boolean binarySearch(int[] nums, int target, int start, int end){

        while(start<=end){
            int mid= start + (end-start)/2;

            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] > target){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return false;
    }
}
