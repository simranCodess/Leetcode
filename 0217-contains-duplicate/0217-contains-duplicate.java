import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==0){
            return false;
        }
        Set<Integer> set=new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}