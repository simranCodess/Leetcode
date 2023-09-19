import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int element = entry.getKey();
            int count = entry.getValue();

            if(count>(nums.length-1)/2){
                return element;
            }
        }
        return 0;
    }
}