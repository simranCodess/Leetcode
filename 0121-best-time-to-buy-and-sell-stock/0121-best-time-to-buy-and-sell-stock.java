import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int n: prices){
            if(n<minPrice){
                minPrice=n;
            }
            else if(n-minPrice>maxProfit){
                maxProfit=n-minPrice;
            }
        }
        return maxProfit;
    }
}