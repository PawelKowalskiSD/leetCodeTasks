package arrays;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] result = new int[flowerbed.length + 2];
        for(int i = 0; i < flowerbed.length; i++) {
            result[i + 1] = flowerbed[i];
        }
        for(int i = 1; i < result.length -1; i++) {
            if(result[i -1] == 0 && result[i] == 0 && result[i + 1] == 0) {
                result[i] = 1;
                n -= 1;
            }
        }
        return n <= 0;
    }
}
