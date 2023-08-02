package Searching.BinarySearch.LeetcodeQue;

import java.util.Arrays;

public class FirstAndLastPosition {
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
    static int[] ans(int[] nums, int target ){
        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] arr, int target, boolean isStart){
        int ans = -1;
        int start = 0;
        int end  = arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(isStart){
                          end = mid -1;
                }else{
                    start = mid + 1;
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,7,7,7,7,8,9};
        int target = 7;
        String x = Arrays.toString(ans(nums, target));
        System.out.println(x);
    }
}
