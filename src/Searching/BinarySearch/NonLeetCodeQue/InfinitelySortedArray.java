package Searching.BinarySearch.NonLeetCodeQue;

public class InfinitelySortedArray {

 static int ans(int[] nums, int target){
     int start = 0;
     int end = 1;

     while(target > nums[end]){
         int temp = end + 1;
         end = end + ((end=start + 1)*2);
         start = temp;
     }
     return binarySearch(nums,target, start, end);
 }

    static int binarySearch(int[] arr, int target, int start, int end){
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


    public static void main(String[] args) {
     int[] arr = {};
    }
}
