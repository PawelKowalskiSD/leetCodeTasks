package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInAString {
    public List<Integer> findAllAnagrams(String s, String p) {
        int start = 0;
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> pMap = new HashMap<>();
        for(char charP : p.toCharArray()) {
            pMap.put(charP, 1 + pMap.getOrDefault(charP, 0));
        }
        for(int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), 1 + sMap.getOrDefault(s.charAt(i), 0));

            if(i >= p.length() -1) {
                if(sMap.equals(pMap)) {
                    result.add(start);
                }
                if(sMap.containsKey(s.charAt(start))) {
                    sMap.put(s.charAt(start), sMap.get(s.charAt(start))-1);
                    if(sMap.get(s.charAt(start)) == 0) {
                        sMap.remove(s.charAt(start));
                    }
                }
                start += 1;
            }
        }
        return result;
    }
}
