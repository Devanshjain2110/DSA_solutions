package Array.LeetCodeQue;
// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
public class NUniqueIntegerSumZero {
    public static void main(String[] args) {

    }
    static int[] sumZero(int n) {
        int[] arr = new int[n];
        int inc = 1;
        if(n%2==0) {
            for(int i = 0; i < n-1; i+=2){
                arr[i] = inc;
                arr[i+1] = -inc;
                inc++;
            }
        }else{
            for(int i = 0; i < n-2; i+=2){
                arr[i] = inc;
                arr[i+1] = -inc;
                inc++;

            }
            arr[n-1] = 0;
        }
        return arr;
    }
}
