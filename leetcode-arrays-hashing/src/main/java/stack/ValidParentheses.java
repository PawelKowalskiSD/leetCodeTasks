package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> memo = new ArrayDeque<>();
        Map<Character, Character> data = new HashMap<>();
        data.put(')', '(');
        data.put(']', '[');
        data.put('}', '{');
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(data.containsKey(c)) {
                if(!memo.isEmpty() && data.get(c).equals(memo.peek())) {
                    memo.pop();
                } else {
                    return false;
                }
            } else {
                memo.push(c);
            }
        }
        return memo.isEmpty();
    }
}
