package Array.LeetCodeQue;
// https://leetcode.com/problems/find-the-highest-altitude/description/
public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr =  {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
    static int largestAltitude(int[] gain) {
        int max = 0;
        int alt = 0;
        int n = gain.length;
        for(int i = 0; i < n; i++){
            alt += gain[i];
            if(alt > max){
                max = alt;
            }
        }
        if(max > 0) return max;

        return 0;
    }
}