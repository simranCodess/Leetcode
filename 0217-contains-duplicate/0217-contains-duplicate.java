import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap<Integer,Integer> count=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
        }

        for(int n: count.values()){
            if(n>1){
                return true;
            }
        }
        
        return false;


    }
}