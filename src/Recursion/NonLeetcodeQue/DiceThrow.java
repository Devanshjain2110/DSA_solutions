package Recursion.NonLeetcodeQue;

// Number of ways to get a number by throwing dice

import java.util.ArrayList;
import java.util.List;

public class DiceThrow {
    public static void main(String[] args) {
        System.out.println(DiceNo("", 4));
    }

    static List<String> DiceNo(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list  = new ArrayList<>();
        for(int i = 1; i<=6 && i<=target; i++){
            list.addAll(DiceNo(p+i, target-i));
        }
return list;
    }
}
