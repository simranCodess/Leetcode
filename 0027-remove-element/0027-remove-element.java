class Solution {
    public int removeElement(int[] nums, int val) {
        int leftPtr=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[leftPtr]=nums[i];
                leftPtr++;
            }
        }
        return leftPtr;
    }
}