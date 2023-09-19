class Solution {
    public boolean canJump(int[] nums) {
       int leftPtr=nums.length-1;
       for(int i=nums.length-2; i>=0; i--){
           if(nums[i]+i>=leftPtr){
               leftPtr=i;
           }
       }
       return leftPtr==0;
    }
}