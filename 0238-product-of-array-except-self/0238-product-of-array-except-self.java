import java.util.*;
class Solution {
    public int[] productExceptSelf(int[] nums) {
        //left multiple
        int [] leftProduct=new int[nums.length];
        int currLeft=1;
        leftProduct[0]=currLeft;
        for(int i=0; i<nums.length-1; i++){
            currLeft*=nums[i];
            leftProduct[i+1]=currLeft;
        }

        int[] rightProduct=new int[nums.length];
        int currRight=1;
        rightProduct[nums.length-1]=currRight;
        for(int i=nums.length-1; i>0; i--){
            currRight*=nums[i];
            rightProduct[i-1]=currRight;
        }

        
        for(int i=0; i<nums.length; i++){
            nums[i]=leftProduct[i]*rightProduct[i];
        }
        return nums;
    }
}