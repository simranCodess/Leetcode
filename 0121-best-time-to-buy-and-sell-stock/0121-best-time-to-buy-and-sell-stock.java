class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int indexOfBuying=0;
        int min=Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
                indexOfBuying=i;
            }
            else if(prices[i]-min>maxProfit&&i>indexOfBuying){
                maxProfit=prices[i]-min;
            }
        }
        return maxProfit;
    }
}