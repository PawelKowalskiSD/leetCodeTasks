package arrays;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] textS = s.toCharArray();
        char[] textT = t.toCharArray();
        Arrays.sort(textS);
        Arrays.sort(textT);
        if (Arrays.equals(textS, textT)) {
            return true;
        }
        return false;
    }
}
