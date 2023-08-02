package Searching.BinarySearch.NonLeetCodeQue;

public class SimpleBinarySearch {
    public static void main(String[] args) {
        int[] arr1 = {23, 45, 67, 89, 102, 104, 456, 678};
        System.out.println(search(arr1, 23));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;



            if(arr[mid] >target){
                end=mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
