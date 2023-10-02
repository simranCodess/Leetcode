class Solution {
    public int arrangeCoins(int n) {
        int stairs=0;
        int coins=0;
        
        /*
        n=8, i=1
        n=7, i=2
        n=5, i=3
        n=2, i=4

        */
        int index=0;
        while(index<=n){
            n=n-index;
            index++;
        }

        return index-1;

    }
}