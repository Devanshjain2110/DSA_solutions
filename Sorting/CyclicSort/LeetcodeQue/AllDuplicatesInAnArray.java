package Sorting.CyclicSort.LeetcodeQue;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AllDuplicatesInAnArray {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> findDuplicates(int[] nums) {
        int  i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int index = 0; index < nums.length; index++ ){
            if(nums[index] != index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}