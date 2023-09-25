package Array.LeetCodeQue;
// https://leetcode.com/problems/find-the-highest-altitude/description/
public class HighestAltitude {
    public static void main(String[] args) {
    }
    static int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int i : gain){
            sum += gain[i];
            if(sum > max){
                max = sum;
            }
        }
        return Math.max(max, 0);
    }
}