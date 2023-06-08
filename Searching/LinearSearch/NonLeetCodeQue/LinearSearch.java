package Searching.LinearSearch.NonLeetCodeQue;

public class LinearSearch {

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0 ) {
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target ) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {45,67,34,23,4,5,6,34};
        int LinSer = linearSearch(arr1, 67);
        System.out.println(LinSer);
    }
}
