package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueEmailAddressesTest {

    @Test
    void shouldNumUniqueEmails() {
        //Given
        UniqueEmailAddresses uniqueEmailAddresses = new UniqueEmailAddresses();
        String[] input1 = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String[] input2 = new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        //When
        int result1 = uniqueEmailAddresses.numUniqueEmails(input1);
        int result2 = uniqueEmailAddresses.numUniqueEmails(input2);
        //Then
        assertEquals(2, result1);
        assertEquals(3, result2);

    }
}