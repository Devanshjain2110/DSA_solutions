package Searching.BinarySearch.NonLeetCodeQue;

public class FindInPeak {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,9,4,3,2,1};
        System.out.println(targetIndex(arr,2 ));
    }

    static int targetIndex(int[] nums, int target){
        int peak = search(nums);
        int firstHalf = search1(nums,target, 0, peak);
        if(firstHalf == -1){
            return search1(nums,target, peak +1, nums.length-1);
        }
        return firstHalf;
    }



    static int search(int[] nums){
        int start = 0;
        int end = nums.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(nums[mid]>nums[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int search1(int[] arr, int target, int start, int end){
        boolean isAsc = arr[end] > arr[start];

        while(start<=end) {
            int mid = start + (end- start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(arr[mid] >target){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            } else{
                if(arr[mid] >target){
                    start = mid+1;
                }
                else {
                    end = mid -1;
                }
            }
        }
        return -1;
    }


}
