package arrays;

public class SimplePigLatin {

    public String pigIt(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = convertWord(words[i]);
        }
        return String.join(" ", words);
    }

    private String convertWord(String word) {
        String firstLetter = word.substring(0, 1);
        return word.substring(1) + firstLetter + "ay";
    }


}
