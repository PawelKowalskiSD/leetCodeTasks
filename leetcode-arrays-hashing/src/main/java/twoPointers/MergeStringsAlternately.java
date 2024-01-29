package twoPointers;

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

    public String mergeFasterAlternately(String word1, String word2) {
        StringBuilder  stringBuilder = new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();
        int count = 0;
        while (count < w1 || count < w2) {
            if(count < w1) {
                stringBuilder.append(word1.charAt(count));
            }
            if(count < w2) {
                stringBuilder.append((word2.charAt(count)));
            }
            count++;
        }
        return stringBuilder.toString();
    }
}
