package Sorting.SelectionSort.LeetCodeQue;

import java.util.Arrays;

//https://leetcode.com/problems/height-checker/description/
public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        int count = 0;
        for(int i = 0; i < expected.length;i++){
            int last = expected.length-1-i;
            int maxi = max(expected, 0, last);
            swap(expected, last, maxi);
            if(heights[last] != expected[last]){
                count++;
            }
        }
        return count;
    }

    int max(int[] arr, int first, int last){
        int max = 0;
        for(int i = 0; i<=last; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
