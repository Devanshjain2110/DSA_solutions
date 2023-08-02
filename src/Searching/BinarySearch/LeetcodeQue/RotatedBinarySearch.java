package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findElement(arr,5));
    }

    static int findElement(int[] nums, int target){
        int pivot = findPivot(nums);

        if(pivot == -1){
            search(nums, target,0 ,nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }

        if(nums[0] >= target){
            return search(nums,target, pivot+1, nums.length-1);
        }
            return search(nums,target,0,pivot-1);
    }   


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

    static int search(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] >target){
                end=mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}

