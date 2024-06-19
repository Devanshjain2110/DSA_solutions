package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class ShipPackages {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }
    public static int shipWithinDays(int[] weights, int days) {
        int start = max(weights);
        int end = sum(weights);

        while(start < end){
            int mid = start + (end-start)/2;
            int dayCount = 1;
            int cur = 0;

            for(int weight : weights){
                if(weight + cur >  mid){
                    cur = 0;
                    dayCount++;
                }
                cur += weight;
            }

            if(dayCount > days){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return start;

    }

   static int max(int[] weights){
        int max = 0;
        for(int weight : weights){
            if(weight > max){
                max = weight;
            }
        }
        return max;
    }

   static int sum(int[] weights){
        int sum = 0;
        for(int weight : weights){
            sum += weight;
        }
        return sum;
    }
}
