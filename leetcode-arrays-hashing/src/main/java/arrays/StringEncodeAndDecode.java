package arrays;

import java.util.ArrayList;
import java.util.List;

public class StringEncodeAndDecode {

    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String res : strs) {
            result.append(res.length()).append("#").append(res);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            i = j + 1 + len;
            result.add(str.substring(j + 1, i));
        }
        return result;
    }
}
