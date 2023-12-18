package arrays;

import java.util.Arrays;

public class Prefix {
    public String longestCommonPrefix(String[] strs) {
        String text = "";
        if (strs.length == 1) {
            text += strs[0];
            return text;
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i == strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return text;
                }
            }
            text += strs[0].charAt(i);
        }
        return text;
    }

    public String longestCommonPrefixFaster(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];
        int count = 0;
        while (count < s1.length() && count < s2.length()) {
            if (s1.charAt(count) == s2.charAt(count)) {
                count++;
            } else {
                break;
            }
        }
        return s1.substring(0, count);
    }
}
