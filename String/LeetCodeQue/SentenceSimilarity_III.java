package String.LeetCodeQue;

public class SentenceSimilarity_III {
    public static void main(String[] args) {
        String sentence1 = "My name is Haley";
        String sentence2 = "My Haley";
        System.out.println(areSentencesSimilar(sentence1,sentence2));
    }

    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1Bigger(sentence1,sentence2)){
            return compare(sentence2,sentence1);
        }
        return compare(sentence1,sentence2);
    }

    static boolean sentence1Bigger(String sentence1, String sentence2){
        return sentence1.length() > sentence2.length();
    }

    static boolean compare(String sentence1, String sentence2){
        for(int i = 0; i <= sentence1.length()/2; i++){
            char start = (sentence1.charAt(i));
            char end = sentence1.charAt(sentence1.length()-i-1);
            char start2 = sentence2.charAt(i);
            char end2 = sentence2.charAt(sentence2.length()-i-1);
            if(start!=start2 || end!=end2){
                return false;
            }
        }
        return true;
    }
}
