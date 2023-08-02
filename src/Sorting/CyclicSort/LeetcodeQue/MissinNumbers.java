package Sorting.CyclicSort.LeetcodeQue;


// https://leetcode.com/problems/missing-number/description/

import java.util.Arrays;

public class MissinNumbers {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};

    }

    static int sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (index != nums[index]) {
                return index;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}





