package arrays;

public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int last = -1;
        for (int j = arr.length - 1; j >= 0; j--) {
            int current = arr[j];
            arr[j] = last;
            last = (last >= current) ? last : current;
        }
        return arr;
    }
}
