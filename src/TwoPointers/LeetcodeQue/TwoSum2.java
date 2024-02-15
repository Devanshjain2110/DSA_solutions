package TwoPointers.LeetcodeQue;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int left  = 0;
        int right = numbers.length -1;

        while(numbers[left] + numbers[right] != target){
            if(numbers[left] + numbers[right] > target){
                right--;
            } else{
                left++;
            }
        }
        return new int[]{left+1, right+1};
    }
}
