package Sorting.QuickSort.LeetCodeQue;
// https://leetcode.com/problems/maximum-product-of-three-numbers/
public class MaximumProductOfThreeNumbers {
    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        sort(nums, 0, nums.length-1);
        return multiply(nums);
    }

   static int multiply(int[] nums){
        int n = nums.length;
        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]);
    }

    static void sort(int[] nums, int low, int hi){
        if(low>=hi){
            return;
        }

        int s = low;
        int e = hi;
        int mid = s + (e-s)/2;
        int pivot = nums[mid];
        while(s<=e){
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        sort(nums, low, e);
        sort(nums, s, hi);
    }
}
