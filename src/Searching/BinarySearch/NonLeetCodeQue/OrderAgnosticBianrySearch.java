package Searching.BinarySearch.NonLeetCodeQue;

public class OrderAgnosticBianrySearch {
    public static void main(String[] args) {
        int[] arr1 = {1000, 456, 345, 328, 256, 201, 156, 122, 108, 45};
        System.out.println(search(arr1, 456));
    }

    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
         boolean isAsc = arr[end] > arr[start];

         while(start<=end) {
             int mid = start + (end- start)/2;

             if(arr[mid] == target){
                 return mid;
             }
             if (isAsc){
                 if(arr[mid] >target){
                     end=mid-1;
                 }
                else{
                     start = mid+1;
                 }
             } else{
                 if(arr[mid] >target){
                     start = mid+1;
                 }
                 else {
                     end = mid -1;
                 }
             }
         }
         return -1;
    }
}
