package Array.LeetCodeQue;
// Redid IsPangram
//  https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class IsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];
        char[] alpha = sentence.toCharArray();

        for(char ch: alpha){
            alphabet[ch - 'a'] = true;
        }

        for(boolean isAlpha : alphabet){
            if(!isAlpha) return false;
        }
        return true;
    }
}
