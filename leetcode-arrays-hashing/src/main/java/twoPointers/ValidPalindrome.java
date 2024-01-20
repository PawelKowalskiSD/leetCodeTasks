package twoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String result = "";
        int x = 0;
        result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = result.length()-1; i >= 0; i--) {
            if(result.charAt(x++) != result.charAt(i)) {
                return false;
            }

        }
        System.out.println(result);
        return true;
    }
}
