package Array.LeetCodeQue;

import java.util.Arrays;

public class TargetArrayGivenOrder {
    public static void main(String[] args) {
        int[]nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[index.length];

        for (int i = 0; i < index.length; i++){
            int temp = nums[i];
            for(int j = index[i]; j < index.length; j++){
                int sent = target[j];
                target[j] = temp;
                temp = sent;
            }
        }
        return target;
    }
}

