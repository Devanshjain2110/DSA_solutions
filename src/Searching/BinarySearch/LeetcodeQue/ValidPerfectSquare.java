package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/valid-perfect-square/
public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
    static boolean isPerfectSquare(int num) {

        if(num == 1)
            return true;

        long start = 1,
                end = num / 2,
                mid = 0;

        long nums = (long)num;

        while(start <= end)
        {
            mid = start + (end - start) / 2;

            if((mid * mid) == nums)
                return true;
            else if( (mid * mid) < nums)
                start = mid + 1;
            else
                end = mid - 1;
        }



        return false;
    }
}
