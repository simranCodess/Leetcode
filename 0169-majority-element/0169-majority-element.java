class Solution {
    public int majorityElement(int[] nums) {
        int count=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int current=nums[i];
            int currentCount=0;
            for(int j=0; j<nums.length; j++){
                if(current==nums[j]){
                    currentCount++;
                }
            }
            if(currentCount>nums.length/2){
                return nums[i];
            }
        }
        return 0;
    }
}