package arrays;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> anagrams = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] result = strs[i].toCharArray();
            Arrays.sort(result);
            String text = String.valueOf(result);
            if (!anagrams.containsKey(text)) {
                anagrams.put(text, new ArrayList<>());
            }
            anagrams.get(text).add(strs[i]);
        }
        return new ArrayList<>(anagrams.values());
    }
}
