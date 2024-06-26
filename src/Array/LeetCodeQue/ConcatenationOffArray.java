package Array.LeetCodeQue;
// https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class ConcatenationOffArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = ans[i+n] = nums[i];
        }
        return ans;
    }
}
