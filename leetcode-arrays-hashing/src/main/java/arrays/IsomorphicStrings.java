package arrays;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Character> maps = new HashMap<>();
        Map<Character, Boolean> mapt = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (!maps.containsKey(charS)) {
                if (mapt.containsKey(charT) && mapt.get(charT)) {
                    return false;
                }
                maps.put(charS, charT);
                mapt.put(charT, true);
            } else {
                if (maps.get(charS) != charT) {
                    return false;
                }
            }
        }
        return true;
    }
}
