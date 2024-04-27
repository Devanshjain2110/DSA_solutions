package Array.LeetCodeQue;
// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSum {
    public static void main(String[] args) {

    }
    static int[] runningSum(int[] nums) {
        int sum = nums[0];
        for(int i =1; i < nums.length; i++){
            nums[i] += sum;
            sum = nums[i];

        }
        return nums;
    }
}
