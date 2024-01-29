package twoPointers;

public class ReverseString {

    public void reverseString(char[] s) {
        int count = 0;
        int size = s.length / 2;
        for(int i = s.length-1; i >= size; i--) {
            char tail = s[count];
            s[count] = s[i];
            s[i] = tail;
            count++;
        }
    }

    public void reverseStringFaster(char[] s) {
        int start = 0;
        int end = s.length-1;

        while (start < end) {
            char tail = s[start];
            s[start] = s[end];
            s[end] = tail;
            start++;
            end--;
        }
    }
}
