package Array.LeetCodeQue;

import java.util.Arrays;
// Re-did this problem
public class ShuffleTheArray {
    public static void main(String[] args) {
       int[] nums = {2,5,1,9,4,7};
       int n = 3;
        System.out.println(Arrays.toString(bruteForce(nums,n)));
        System.out.println(Arrays.toString(twoPointer(nums,n)));
    }

    static int[] bruteForce(int[] nums, int n){
        int[] mix = new int[2*n];
        int i = 0;
        int j = n;
        int k = 0;
        while(i < n && j < 2*n){
            mix[k] = nums[i];
            mix[k+1] = nums[j];
            i++;
            j++;
            k+=2;
        }
        return mix;
    }

    static int[] twoPointer(int[] nums, int n){
        int len = nums.length;
        for(int i = n; i < len; i++){
            nums[i] = nums[i]*1024 + nums[i-n];
        }
        int index = 0;
        for(int i = n; i < len; i++, index+=2){
            nums[index] = nums[i]%1024;
            nums[index+1] = nums[i]/1024;
        }

        return nums;
    }
}
