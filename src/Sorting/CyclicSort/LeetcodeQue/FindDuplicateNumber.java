package Sorting.CyclicSort.LeetcodeQue;


// https://leetcode.com/problems/find-the-duplicate-number/submissions/982299033/
public class FindDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int  i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int index =0; index < nums.length; index++){
            if(nums[index] != (index+1)){
                return nums[index];
            }
        }
        return -1;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

