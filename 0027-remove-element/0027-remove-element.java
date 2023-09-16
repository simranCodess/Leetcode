class Solution {
    public int removeElement(int[] nums, int val) {
        int index1=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[index1]=nums[i];
                index1++;
            }
        }
        return index1;
    }
}