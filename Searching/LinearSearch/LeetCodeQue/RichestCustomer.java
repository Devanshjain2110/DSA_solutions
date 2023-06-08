package Searching.LinearSearch.LeetCodeQue;
// https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomer {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 7},
                {7,3},
                {3,5}
        };

        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int cust = 0; cust < arr.length; cust++){
            int sum = 0;
            for(int acc = 0; acc < arr[cust].length; acc++){
                sum += arr[cust][acc];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
