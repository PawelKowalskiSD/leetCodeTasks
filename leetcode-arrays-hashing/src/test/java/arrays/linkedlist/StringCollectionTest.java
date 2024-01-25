package arrays.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCollectionTest {

    @Test
    void shouldGetElement() {
        //Given
        StringCollection stringCollection = new StringCollection();
        String input1 = "Pawel";
        String input2 = "Rafal";
        String input3 = "Piotr";
        stringCollection.addElement(input1);
        stringCollection.addElement(input2);
        stringCollection.addElement(input3);
        //When
        String result1 = stringCollection.getElement(0);
        String result2 = stringCollection.getElement(1);
        String result3 = stringCollection.getElement(2);
        //Then
        assertEquals("Pawel", result1);
        assertEquals("Rafal", result2);
        assertEquals("Piotr", result3);
    }

    @Test
    void shouldAddElement() {
        //Given
        StringCollection stringCollection = new StringCollection();
        String input1 = "Pawel";
        String input2 = "Rafal";
        String input3 = "Piotr";
        //When
        stringCollection.addElement(input1);
        stringCollection.addElement(input2);
        stringCollection.addElement(input3);
        //Then
        String result1 = stringCollection.getElement(0);
        String result2 = stringCollection.getElement(1);
        String result3 = stringCollection.getElement(2);
        assertEquals("Pawel", result1);
        assertEquals("Rafal", result2);
        assertEquals("Piotr", result3);
    }

    @Test
    void shouldRemoveElement() {
        //Given
        StringCollection stringCollection = new StringCollection();
        String input1 = "Pawel";
        String input2 = "Rafal";
        String input3 = "Piotr";
        stringCollection.addElement(input1);
        stringCollection.addElement(input2);
        stringCollection.addElement(input3);
        //When
        boolean result1 = stringCollection.removeElement(input1);
        boolean result2 = stringCollection.removeElement(input2);
        boolean result3 = stringCollection.removeElement(input3);
        boolean result4 = stringCollection.removeElement(input1);
        //Then
        assertTrue(result1);
        assertTrue(result2);
        assertTrue(result3);
        assertFalse(result4);
    }
}