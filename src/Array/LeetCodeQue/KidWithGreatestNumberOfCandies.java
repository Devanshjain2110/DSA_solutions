package Array.LeetCodeQue;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidWithGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandy = 3;
        System.out.println(kidsWithCandies(candies,extraCandy));
    }


    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n  = candies.length;
        List<Boolean> result = new ArrayList<Boolean>(n);
        int max = max(candies);
        for(int i = 0; i < n; i++ ){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
    static int max(int[] candies){
        int max = 0;
        for(int i = 0; i < candies.length; i++ ){
            if(candies[i] >= max){
                max = candies[i];
            }
        }
        return max;
    }

}
