class Solution {
    public int findMin(int[] nums) {
        //brute force will be O(n) but we want O(logn) which is binary search algortihm
        //the goal of this approach is to find the pivot point, i.e the largest elemtnof the left sorted side
        int left=0;
        int right=nums.length-1;
        int answer=Integer.MAX_VALUE;
        while(left<=right){
            int mid=(left+right)/2;
            
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                answer=Math.min(answer,nums[mid]);
                right=mid-1;
            }
        }
        return answer; //space complexity of O(1) and time complexity of O(log n)
    }
}