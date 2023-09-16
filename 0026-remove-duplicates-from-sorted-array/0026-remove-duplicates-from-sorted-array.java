
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int leftIndex=0;
        for(int i=1; i<nums.length; i++){
            if(nums[leftIndex]!=nums[i]){
                leftIndex++;
                nums[leftIndex]=nums[i];
            }
        }
        return leftIndex+1;
    }
}