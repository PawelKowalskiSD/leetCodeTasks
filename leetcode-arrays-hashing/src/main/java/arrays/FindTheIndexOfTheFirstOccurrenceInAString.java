package arrays;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {
        int count = needle.length();
        if(haystack.equals(needle)) {
            return 0;
        } else {
            for(int i = 0; i <= (haystack.length() - needle.length()); i++) {
                if(needle.equals(haystack.substring(i, count))) {
                    return i;
                } else {
                    count++;
                }
            }
            return -1;
        }
    }
}
