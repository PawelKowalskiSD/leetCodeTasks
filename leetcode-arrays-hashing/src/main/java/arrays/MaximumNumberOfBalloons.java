package arrays;

import java.util.HashMap;

public class MaximumNumberOfBalloons {
    public int counterNumberOfBalloon(String text) {
        HashMap<Character, Integer> balloon = new HashMap<>();
        HashMap<Character, Integer> countText = new HashMap<>();
        char[] balloonArray = "balloon".toCharArray();
        for (char i : balloonArray) {
            if (balloon.containsKey(i)) {
                balloon.put(i, balloon.get(i) + 1);
            } else
                balloon.put(i, 1);
        }
        char[] countTextArray = text.toCharArray();
        for (char c : countTextArray) {
            if (countText.containsKey(c)) {
                countText.put(c, countText.get(c) + 1);
            } else
                countText.put(c, 1);
        }
        int result = text.length();
        for (Character c : balloon.keySet()) {
            result = Math.min(result, countText.getOrDefault(c, 0) / balloon.get(c));
        }
        return result;
    }
}
