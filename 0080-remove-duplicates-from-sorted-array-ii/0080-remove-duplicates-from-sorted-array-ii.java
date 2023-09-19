import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int leftPtr=0;
        int rightPtr=0;

        while(rightPtr<nums.length){
            int count=1;
            while(rightPtr+1<nums.length&&nums[rightPtr]==nums[rightPtr+1]){
                count++;
                rightPtr++;
            }
            for(int i=0; i<Math.min(count,2); i++){
                nums[leftPtr]=nums[rightPtr];
                leftPtr++;
            }
            rightPtr++;
        }
        return leftPtr;
    }
}