import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
       if(nums.length==0){
           return 0;
       }

       int majorityElement=nums[0];
       int count=1;

       for(int i=1; i<nums.length; i++){
           if(nums[i]==majorityElement){
               count++;
           }
           else{
               count--;
           }
           if(count==0){
               majorityElement=nums[i];
               count=count+1;
           }
       }
        return majorityElement;
    }
}