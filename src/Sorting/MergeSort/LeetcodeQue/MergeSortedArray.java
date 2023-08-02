package Sorting.MergeSort.LeetcodeQue;

import java.util.Arrays;
// https://leetcode.com/problems/merge-sorted-array/description/https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;;
        int[] nums2 = {2,5,6};
        int n = nums2.length;
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mix = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < m && j<n){
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            }else{
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            mix[k] = nums1[i];
            k++;
            i++;
        }

        while(j < n){
            mix[k] = nums2[j];
            k++;
            j++;
        }

        for(int l=0; l < m+n; l++){
            nums1[l] = mix[l];
        }
    }
}
