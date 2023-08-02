package Sorting.SelectionSort.NonLeetCodeQue;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
         selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] nums){
        for (int i = 0; i <= nums.length-1 ; i++) {
            int last = nums.length-i-1;
            int max = getMaxIndex( nums, 0, last);
            swap(nums, last, max);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i<=end; i++) {
            if(arr[max] < arr[i] ){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
