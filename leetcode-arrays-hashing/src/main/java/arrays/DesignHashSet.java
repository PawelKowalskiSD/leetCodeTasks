package arrays;

public class DesignHashSet {
    boolean[] hashSet;

    public DesignHashSet() {
        hashSet = new boolean[(int) 1e6 + 1];
    }

    public void add(int key) {
        hashSet[key] = true;
    }

    public void remove(int key) {
        hashSet[key] = false;
    }

    public boolean contains(int key) {
        return hashSet[key];
    }
}
