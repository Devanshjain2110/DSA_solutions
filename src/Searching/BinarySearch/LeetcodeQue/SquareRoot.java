package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/sqrtx/
// Redid Square Root
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(99));
    }
    static int mySqrt(int x) {
        int start = 0;
        int end = x;
        while(start <= end){
            int mid = start + (end-start)/2;

            if((long) mid*mid > (long) x){
                end = mid-1;
            } else if(mid*mid < x){
                start = mid+1;
            } else{
                return mid;
            }
        }
        return end;
    }
}
