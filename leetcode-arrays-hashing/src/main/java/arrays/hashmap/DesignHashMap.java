package arrays.hashmap;

import java.util.Arrays;

public class DesignHashMap {

    private final int[] arrayHashMap;

    public DesignHashMap() {
        arrayHashMap = new int[1000001];
        Arrays.fill(arrayHashMap, -1);
    }

    public void put(int key, int value) {
        arrayHashMap[key] = value;
    }

    public int get(int key) {
        return arrayHashMap[key];
    }

    public void remove(int key) {
        arrayHashMap[key] = -1;
    }
}
