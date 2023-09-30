import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
        //edge case
        if(nums.length==0){
            return result;
        }
        /*Brute force approach
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result; time complexity of O(n^2) and space complexity of O(1)*/

        //optimal approach 
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                result[0]=map.get(diff);
                result[1]=i;
            }
            map.put(nums[i],i);
        }
        return result; //time complexity of O(N) and space complexity of O(n)
    }
}