package arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> score = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j > 0 && result.get(i - 1).size() - 1 >= j) {
                    score.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                } else {
                    score.add(1);
                }
            }
            result.add(score);
        }
        return result;
    }
}
