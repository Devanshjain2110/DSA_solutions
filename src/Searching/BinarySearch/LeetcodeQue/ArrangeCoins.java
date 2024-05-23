package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/arranging-coins/
public class ArrangeCoins {
    public static void main(String[] args) {

    }
    public int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        while(start<=end){
            long mid = start + (end-start)/2;
            long sm = mid*(mid+1)/2;
            if(sm == n){
                return (int)mid;
            }else if(sm > n){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return (int)end;
    }
}
