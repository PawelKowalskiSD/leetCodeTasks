package twoPointers;

public class ValidPalindromeSecond {
    public boolean validPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;
        int firstIndex = 0;
        int lastIndex = 0;
        boolean firstCondition = true;
        boolean secondCondition = true;
        while (first < last) {
            if (s.length() < 3) {
                return true;
            }
            if (s.charAt(first) == s.charAt(last)) {
                first++;
                last--;
            } else {
                if (!firstCondition) {
                    if (!secondCondition) {
                        first = firstIndex;
                        last = lastIndex;
                        secondCondition = true;
                    }
                    if (s.charAt(first + 1) == s.charAt(last)) {
                        first += 1;
                        last -= 1;
                    } else
                        return false;
                } else {
                    if (s.charAt(first) == s.charAt(last - 1)) {
                        if (secondCondition) {
                            firstIndex = first;
                            lastIndex = last;
                            secondCondition = false;
                        }
                        firstCondition = false;
                        last -= 1;
                    } else {
                        firstCondition = false;
                    }
                }
            }
        }
        return true;
    }
}
