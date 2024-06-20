package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] med = new int[m+n];

        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            if(nums1[i] > nums2[j]){
                med[k] = nums2[j];
                j++;
            } else {
                med[k] = nums1[i];
                i++;
            }
            k++;
        }

        if(i < m){
            for(int x = i; x < m; x++){
                med[k] = nums1[x];
                k++;
            }
        }

        if(j < n){
            for(int y= j; y < n; y++){
                med[k] = nums2[y];
                k++;
            }
        }

        int start = 0;
        int end = med.length-1;
        if((m+n)%2 == 0){
            int mid = start + (end-start)/2;
            double ans = (double)(med[mid] + med[mid+1])/2;
            return ans;
        }
        int mid = start + (end-start)/2;
        double ans = med[mid];
        return ans;
    }
}
