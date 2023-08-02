package Searching.BinarySearch.NonLeetCodeQue;

public class FloorOfNumbers {
    public static void main(String[] args) {
        int[] arr1 = {2, 45, 56, 87, 230, 445, 556, 678, 876};
        System.out.println(floor(arr1, 556));
    }

    static int floor(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        if(target > arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] > target){
                end = mid -1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
