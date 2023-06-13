package Searching.BinarySearch.NonLeetCodeQue;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(findPivot(arr));
    }

    static int count(int[] nums){
        return findPivot(nums) +1;
    }


    // for array with no duplicates
    static int findPivot(int[] nums){
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


    // for array with duplicates
    static int findPivotDUP(int[] nums){
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

            if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
