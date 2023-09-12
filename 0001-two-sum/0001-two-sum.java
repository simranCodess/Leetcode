import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] answer=new int [2];
        HashMap <Integer,Integer> myMap=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int diff=target-nums[i];
            if(myMap.containsKey(diff)){
                answer[0]=myMap.get(diff);
                answer[1]=i;
            }
            myMap.put(nums[i],i);
        }
        return answer;
    }
}