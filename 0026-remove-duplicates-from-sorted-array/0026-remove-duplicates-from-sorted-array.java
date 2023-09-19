
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int leftPtr=0;
        for(int i=1; i<nums.length; i++){
            if(nums[leftPtr]==nums[i]){
                continue;
            }
            else{
                leftPtr++;
                nums[leftPtr]=nums[i];
            }
        }
        return leftPtr+1;
    }
    
}