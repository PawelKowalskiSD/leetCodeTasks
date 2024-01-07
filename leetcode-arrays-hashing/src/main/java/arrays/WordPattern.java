package arrays;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Boolean> sMap = new HashMap<>();
        String[] text = s.split(" ");
        if (text.length != pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            char charPattern = pattern.charAt(i);
            String stringS = text[i];

            if (!patternMap.containsKey(charPattern)) {
                if (sMap.containsKey(stringS) && sMap.get(stringS)) {
                    return false;
                }
                patternMap.put(charPattern, stringS);
                sMap.put(stringS, true);
            } else {
                if (!patternMap.get(charPattern).equals(stringS)) {
                    return false;
                }
            }
        }
        return true;
    }
}
