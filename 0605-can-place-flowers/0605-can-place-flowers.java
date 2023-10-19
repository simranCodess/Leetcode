
    class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int j = n;

        while (i < flowerbed.length && j > 0) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                j--;
                flowerbed[i] = 1;
            }
            i++;
        }

        return j == 0;
    }
}