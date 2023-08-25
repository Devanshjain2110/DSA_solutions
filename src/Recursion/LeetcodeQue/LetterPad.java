package Recursion.LeetcodeQue;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class LetterPad {
    public static void main(String[] args) {
        System.out.println( letters("", "23"));
    }

    static List<String> letters(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int ch = up.charAt(0) - '0';
       int i = (ch-2)*3;
       if(ch>7){
           i+=1;
       }
       int len = i + 3;
       if(ch == 7 || ch ==9){
           len +=1;
       }
       ArrayList<String> list = new ArrayList<>();
        for(; i < len; i++){
            char cha = (char)('a' + i);
            list.addAll( letters(p+cha, up.substring(1)));
        }
        return list;
    }
}
