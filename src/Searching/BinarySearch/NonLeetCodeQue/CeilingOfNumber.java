package Searching.BinarySearch.NonLeetCodeQue;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4 , 6, 11, 24, 45};
        System.out.println(ceil(arr1, 4));
    }

    static int ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        while(start<= end){
            int mid = start + (end-start)/2;

            if(arr[mid]>target){
                end = mid -1;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }else{
                return arr[mid];
            }
        }
        return arr[start];
    }
}
