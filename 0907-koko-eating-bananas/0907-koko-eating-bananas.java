class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        /* brute force solution, but it results in time limit exceeded so we will do optimal approach
        int max = piles[0];
        for (int n : piles) {
            if (max < n) {
                max = n;
            }
        }
        int minHours = Integer.MAX_VALUE; 
        int minSpeed = 1;
        while (minSpeed <= max) {
            int currSpeed = minSpeed;
            int currHours = 0;
            for (int j = 0; j < piles.length; j++) {
                currHours += Math.ceil((double) piles[j] / currSpeed);
            }
            if (currHours <= h) {
                return minSpeed; 
            }
            minSpeed++;
        }

        return -1;*/ // space complexity is O(1) Time Complexity: O((max) * piles.length)

        //optimal approach : using binary search on the speed possibility array
         int max = piles[0];
        for (int n : piles) {
            if (max < n) {
                max = n;
            }
        }
        int left=1;
        int right=max;
        int result=Integer.MAX_VALUE;
        while(left<=right){
            int middle=(left+right)/2;
            int hours=0;
            for(int pile: piles){
                hours += Math.ceil((double) pile / middle);
            }
            if(hours<=h){
                result=Math.min(result,middle);
                 right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        return result; //space complexity is O(1) Time Complexity: O(log(max) * piles.length)
    }
}
