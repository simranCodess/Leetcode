class Solution {
    public int findPeakElement(int[] nums) {
        int left=0;
        int right=nums.length-1;

        if(nums.length==1){
            return 0;
        }
        /*
        1,2,3,1
        m=4/2=2 3
        1,2,1,3,5,6,4
        m=7/2 ~3
        3>1 but 3<5
        so left=5 and mid=5+7/2=6
        6 and 6 is good answer
        what if mid is smaller then both??
        12123
        mid=1



        */
        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]>nums[mid+1]){
               right=mid;
            }
            else{
                left=mid+1;
            }
            
        }
        return left;
    }
}