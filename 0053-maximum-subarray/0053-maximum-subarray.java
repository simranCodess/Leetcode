import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        //kadene's algorthim
        //the algorthim says that at any given index, we need to see if the subarray emding at
        //that index is greater then, just the singular subarray of that index, if it is not, we
        //will just add the current index onto the subbaray or we can start a new array with that index.
        
        int maxSum=nums[0];
        int currSum=nums[0];
        if(nums.length==1){
            return nums[0];
        }

        for(int i=1; i<nums.length; i++){
            if(currSum+nums[i]>nums[i]){
                currSum=currSum+nums[i];
            }
            else{
                currSum=nums[i];
            }
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}