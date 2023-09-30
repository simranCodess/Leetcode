class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        //brute force approach
         Arrays.sort(nums);
         int answer=1;
        int currSeq=1;
         for(int i=1; i<nums.length; i++){
             if(nums[i]!=nums[i-1]){
                
                 if(nums[i-1]+1==nums[i]){
                     currSeq++;
                 }
                 else{
                     currSeq=1;
                 }
                 answer=Math.max(currSeq,answer);
             }
         }
         
         return answer;
    }
}