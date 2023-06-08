package Array.LeetCodeQue;
// https://leetcode.com/problems/build-array-from-permutation/
import java.util.Arrays;

public class BuildArrayFromPermutation {
    public static void main(String[] args) {
        int[] arr1 = { 5, 0, 1, 2, 3, 4 };
        System.out.println(Arrays.toString(buildArray(arr1)));
    }

    static int[] buildArray1(int[] nums){
        int[] ans = new int[nums.length];
        for( int i = 0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    static int[] buildArray(int[] nums) {

        for( int i = 0; i<nums.length; i++){
            nums[i] = nums[i] + (nums.length * (nums[nums[i]] % nums.length));
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i]/nums.length;
        }
        return nums;
    }
}

