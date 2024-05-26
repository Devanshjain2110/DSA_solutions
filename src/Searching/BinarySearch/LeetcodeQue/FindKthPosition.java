package Searching.BinarySearch.LeetcodeQue;

// https://leetcode.com/problems/kth-missing-positive-number/
// Redid
public class FindKthPosition {
    public static void main(String[] args) {
       int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println( findKthPositive(arr, k));
    }
    static int findKthPositive(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] - mid <= k) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start + k;
    }
}
