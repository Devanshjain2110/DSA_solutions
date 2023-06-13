package Array.LeetCodeQue;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        productExceptSelf(arr);
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] answer = new int[nums.length];
        int p = 1;

        for(int i = 0; i < nums.length; i++){
            prefix[i] = nums[i]*p;
            p = prefix[i];
        }
        int ps = 1;
        for(int j = nums.length-1 ; j >= 0 ; j--){
            suffix[j] = nums[j]*ps;
            ps = suffix[j];
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                answer[i] = suffix[i+1];
            }
            else if(i == nums.length-1){
                answer[i] = prefix[i-1];
            }
            else{
                answer[i] = prefix[i-1] * suffix[i+1];
            }
        }
        return answer;
    }
}

