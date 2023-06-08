package Searching.LinearSearch.LeetCodeQue;
  // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String[] args) {
        int[] arr1 = {12, 345, 2, 6, 7896, 6630};
        int number = numDig(arr1);
        System.out.println(number);
    }

    static int numDig(int[] arr){
        int count =0;
        for(int i = 0; i< arr.length; i++){
                if(isEven(arr[i])){
                    count++;
                }

        }
        return count;
    }

    static boolean isEven(int num){
        return checkNum(num) % 2 == 0;
    }

    static int checkNum(int x){

        if(x<0){
            x = x * -1;
        }

        if(x == 0){
            return 1;
        }
        int count = 0;
        while(x>0){
            count++;
            x = x/10;
        }
        return count;
    }
}
