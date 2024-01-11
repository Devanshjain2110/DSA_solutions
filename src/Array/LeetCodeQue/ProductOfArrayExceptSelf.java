package Array.LeetCodeQue;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf1(arr)));
    }

    // O(1) Space

    static int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int productBefore = 1;
        for(int i = 0; i < n; i++){
            arr[i] = productBefore;
            productBefore *= nums[i];
        }


        int productAfter = 1;
        for(int i = n-1; i >= 0; i--){
            arr[i] *= productAfter;
            productAfter *= nums[i];
        }


        return arr;
    }

    // O(N) space
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixArray = new int[n];
        int[] suffixArray = new int[n];

        prefixArray[0] = nums[0];
        for(int i = 1; i < n; i++){
            prefixArray[i] = prefixArray[i-1] * nums[i];
        }


        suffixArray[n-1] = nums[n-1];
        for(int i = n - 2; i >= 0 ; i--){
            suffixArray[i] = suffixArray[i+1] * nums[i];
        }

        nums[0] = suffixArray[1];
        nums[n-1] = prefixArray[n-2];
        for(int i = 1; i < n-1; i++){
            nums[i] = prefixArray[i-1] * suffixArray[i+1];
        }
        return nums;
    }
}

