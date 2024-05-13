package Array.LeetCodeQue;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// Redid even digits
public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num){
        return numDigits(num) % 2 == 0;
    }

    static int numDigits(int num) {
        int count  = 0;
        if(num == 0) count++;
        if(num <= 0 ) num *= -1;

        while(num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
