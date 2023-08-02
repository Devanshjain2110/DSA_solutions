package Sorting.BubbleSort.NonLeetCodeQue;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
          bubble(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubble(int[] arr){
        boolean swapped;
        for(int i = 0; i <= arr.length-1; i++){
            swapped = false;
            for(int j = 1; j <= arr.length-i-1 ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break;
            }
        }
    }
}
