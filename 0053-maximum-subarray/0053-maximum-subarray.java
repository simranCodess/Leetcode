import java.util.*;
class Solution {
    public int maxSubArray(int[] nums) {
        //kadene's algorthim
        //the algorthim says that at any given index, we need to see if the subarray emding at
        //that index is greater then, just the singular subarray of that index, if it is not, we
        //will just add the current index onto the subbaray or we can start a new array with that index.
        ArrayList<Integer> maxSub=new ArrayList<>();
        maxSub.add(nums[0]); //starting with just 1 elemnt subarray
        int maxSum=nums[0];
        int currSum=nums[0];
        if(nums.length==1){
            return nums[0];
        }

        for(int i=1; i<nums.length; i++){
            if(currSum+nums[i]>nums[i]){
                currSum=currSum+nums[i];
                maxSub.add(nums[i]);
            }
            else{
                maxSub.clear();
                maxSub.add(nums[i]);
                currSum=nums[i];
            }
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}