package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findTheDifference(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> arrays1 = new ArrayList<>();
        List<Integer> arrays2 = new ArrayList<>();
        check(nums1, nums2, arrays1, arrays2);
        output.add(arrays1);
        output.add(arrays2);
        return output;
    }

    private static void check(int[] nums1, int[] nums2, List<Integer> arrays1, List<Integer> arrays2) {
        for(int i = 0; i < nums1.length; i++) {
            int array1 = Arrays.binarySearch(nums2, nums1[i]);
            if(array1 < 0 && !arrays1.contains(nums1[i])) {
                arrays1.add(nums1[i]);
            }
        }

        for(int i = 0; i < nums2.length; i++) {
            int array2 = Arrays.binarySearch(nums1, nums2[i]);
            if(array2 < 0 && !arrays2.contains(nums2[i])) {
                arrays2.add(nums2[i]);
            }
        }
    }
}
