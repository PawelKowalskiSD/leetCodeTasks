package arrays;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] result = s.split(" ");
        String findLastWord = result[result.length - 1];
        return findLastWord.length();
    }

    public int secondLengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            count++;
        }
        return count;
    }
}
