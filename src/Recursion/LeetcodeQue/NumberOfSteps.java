package Recursion.LeetcodeQue;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }

    static int numberOfSteps(int num) {
        return count(num, 0);
    }


    static int count(int num, int count){
        if(num == 0 ){
            return count;
        }

        if(num %2 == 0 ){
            return count(num/2, count + 1);
        }
        return count(num-1, count + 1);
    }
}
