package arrays;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int k = j; k <= nums2.length - 1; k++) {
                        if (nums1[i] < nums2[k]) {
                            result[i] = nums2[k];
                            break;
                        } else
                            result[i] = -1;
                    }
                }
            }
        }
        return result;
    }
}
