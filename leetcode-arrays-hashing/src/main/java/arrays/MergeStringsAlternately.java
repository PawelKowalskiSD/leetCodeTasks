package arrays;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        String end = "";
        int size = word1.length();
        if(word1.length() > word2.length()) {
            size = word2.length();
            end = word1.substring(word2.length());
        } else if(word1.length() < word2.length()) {
            end = word2.substring(word1.length());
        }
        for(int i = 0; i < size; i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }
        return result + end;
    }
}
