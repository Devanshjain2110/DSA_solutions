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
        int n = candies.length;
        ArrayList<Boolean> result = new ArrayList<>();
         int maxi = 0;
         for (int candy : candies) {
             if (candy > maxi) {
                 maxi = candy;
             }
         }
         for (int candy : candies) {
             if ((candy + extraCandies) >= maxi) {
                 result.add(true);
             } else {
                 result.add(false);
             }
         }
        return result;
    }

}
