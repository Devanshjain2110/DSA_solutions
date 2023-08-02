package Array.LeetCodeQue;
// https://leetcode.com/problems/majority-element/description/
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));

    }

    static int majorityElement(int[] nums) {
        int max = nums[0];
        int count =1;
        for(int i = 1; i<nums.length; i++){
            if(count == 0){
                count++;
                max=nums[i];
            } else if(max==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return max;
    }
}
