package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateTest {

    @Test
    void shouldContainsDuplicate() {
        //Given
        Duplicate duplicate = new Duplicate();
        int[] nums1 = new int[]{1,2,3,1};
        int[] nums2 = new int[]{1,2,3,4};
        int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        //When
        boolean result1 = duplicate.containsDuplicate(nums1);
        boolean result2 = duplicate.containsDuplicate(nums2);
        boolean result3 = duplicate.containsDuplicate(nums3);
        //Then
        assertTrue(result1);
        assertFalse(result2);
        assertTrue(result3);

    }
}