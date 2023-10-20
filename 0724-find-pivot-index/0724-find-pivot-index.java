class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i: nums){
            sum+=i;
        }
        int leftSum=0;
        for(int j=0; j<nums.length; j++){
            int rightSum=sum-leftSum;
            leftSum+=nums[j];
            if(rightSum==leftSum){
                return j;
            }
            
        }
        return -1;
    }
}