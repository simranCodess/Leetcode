import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int expectedSum=0;
        int actualSum=0;

        for(int i=0; i<nums.length; i++){
            actualSum+=nums[i];
        }

        for(int i=0; i<nums.length+1; i++){
            expectedSum+=i;
        }

        return expectedSum-actualSum;
    }
}