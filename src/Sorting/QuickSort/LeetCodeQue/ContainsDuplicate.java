package Sorting.QuickSort.LeetCodeQue;
// https://leetcode.com/problems/contains-duplicate/

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,14,18,22,22};
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] nums) {
        sort(nums, 0, nums.length-1);
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

   static  void sort(int[] nums, int low, int hi){
        if(low >= hi){
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e-s)/2;
        int pivot = nums[m];

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
