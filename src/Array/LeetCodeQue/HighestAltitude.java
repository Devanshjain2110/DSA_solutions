package Array.LeetCodeQue;
// https://leetcode.com/problems/find-the-highest-altitude/description/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr =  {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {
        int maximum = 0;
        int sum = 0;
        for(int i =0; i <gain.length; i++){
            sum += gain[i];
            if(sum > maximum){
                maximum = sum;
            }
        }
        if(maximum > 0){
            return maximum;
        }else
            return 0;
    }
}