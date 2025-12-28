package Array.LeetCodeQue;
// Redid on 28-12-25
//  https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class IsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    static  boolean checkIfPangram(String sentence) {
        boolean[] alphabets = new boolean[26];
        char[] chars = sentence.toCharArray();
        for(char c : chars){
            int num = (int) (c - 'a');
            if(!alphabets[num]){
                alphabets[num] = true;
            }
        }

        for (boolean alphabet : alphabets) {
            if(!alphabet){
                return false;
            }
        }

        return true;
    }
}
