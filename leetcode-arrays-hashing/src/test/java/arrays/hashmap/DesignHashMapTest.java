package arrays.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignHashMapTest {

    @Test
    void shouldPut() {
        //Given
        DesignHashMap designHashMap = new DesignHashMap();
        designHashMap.put(1,1);
        designHashMap.put(2,2);
        //When
        int result1 = designHashMap.get(1);
        int result2 = designHashMap.get(2);
        //Then
        assertEquals(1, result1);
        assertEquals(2, result2);
    }

    @Test
    void shouldGet() {
        //Given
        DesignHashMap designHashMap = new DesignHashMap();
        designHashMap.put(1,1);
        designHashMap.put(2,2);
        //When
        int result1 = designHashMap.get(1);
        int result2 = designHashMap.get(2);
        //Then
        assertEquals(1, result1);
        assertEquals(2, result2);
    }

    @Test
    void shouldRemove() {
        //Given
        DesignHashMap designHashMap = new DesignHashMap();
        designHashMap.put(1,1);
        designHashMap.put(2,2);
        //When
        designHashMap.remove(1);
        int result1 = designHashMap.get(1);
        int result2 = designHashMap.get(2);
        //Then
        assertEquals(-1, result1);
        assertEquals(2, result2);
    }
}