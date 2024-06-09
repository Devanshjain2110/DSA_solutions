package Searching.BinarySearch.LeetcodeQue;
// https://leetcode.com/problems/reach-a-number/
public class ReachNumber {
    public static void main(String[] args) {
        System.out.println(reachNumber(4));
    }
    static int reachNumber(int target) {
        if(target < 0) {
            target = target*-1;
        }
        int current = 0;
        int i = 0;

        while(current < target ){
            current += i;
            i++;
        }

        while((current-target)%2 != 0){
            current +=i;
            i++;
        }
        return i - 1;
    }
}
