package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
// redid

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,5));
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(pivot == -1) return binarySearch(nums, target, 0, nums.length-1);
        if(nums[pivot] == target) return pivot;



        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot);
        }

        return binarySearch(nums, target, pivot+1, nums.length-1);
    }


    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <=end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                end = mid-1;
            } else if(arr[mid] < target){
                start = mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(mid <  end && arr[mid] > arr[mid+1]){
                return mid;
            }

            if(start < mid && arr[mid -1] > arr[mid]){
                return mid-1;
            }

            if(arr[start] >= arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }
}

