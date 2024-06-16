package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/find-the-duplicate-number/
public class findDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int count;
        while(start <= end){
            int mid = start + (end - start)/2;

            count = 0;

            for(int num : nums){
                if(num <= mid) {
                    count++;
                }
            }
            if(count <= mid){
                start = mid + 1;
            } else {
                end = mid-1;
            }
        }
        return start;
    }
}
