package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/koko-eating-bananas/
public class KokoEatingBananas {
    public static void main(String[] args) {

    }

    static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(canEatInTime(piles, mid, h)) right = mid - 1;
            else left = mid + 1;
        }
        return left;
    }
    static boolean canEatInTime(int piles[], int k, int h){
        long hours = 0;
        for(int pile : piles){
            int div = pile / k;
            hours += div;
            if(pile % k != 0) hours++;
        }
        return hours <= h;
    }
}
