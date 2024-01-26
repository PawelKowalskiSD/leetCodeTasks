package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignParkingSystemTest {

    @Test
    void shouldAddCar() {
        //Given
        DesignParkingSystem designParkingSystem = new DesignParkingSystem(1,1,0);
        //When
        boolean result1 = designParkingSystem.addCar(1);
        boolean result2 = designParkingSystem.addCar(2);
        boolean result3 = designParkingSystem.addCar(3);
        boolean result4 = designParkingSystem.addCar(1);
        //Then
        assertTrue(result1);
        assertTrue(result2);
        assertFalse(result3);
        assertFalse(result4);
    }

}