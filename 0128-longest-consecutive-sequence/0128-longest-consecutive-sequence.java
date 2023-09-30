class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        /*Brute force approach : we skip similar values and compare the currnt value with the previous one and increment count based on that
         Arrays.sort(nums);
         int answer=1;
        int currSeq=1;
         for(int i=1; i<nums.length; i++){
                 if(nums[i-1]==nums[i]){
                     continue;
                 }
                
                 if(nums[i-1]+1==nums[i]){
                     currSeq++;
                 }
                 else{
                     currSeq=1;
                 }
                 answer=Math.max(currSeq,answer);
             
         }
         
         return answer; */ //time complexity : O(nlogn) and space: O(1)

         //optimal approach: does the left neighbour exist??? if not, check the right neighbour
         Set<Integer> set=new HashSet<>();
         for(int n: nums){
             set.add(n);
         }
        int answer=1;
        
         for(int i=0; i<nums.length; i++){
             int curr=nums[i];
             int currSeq=1;
             //does left neighbour exits, if it does we ca discard this since its not the part of the sequence
             if(set.contains(curr-1)){
                 continue;
             }
             //if it does , this is the start of a sequence
             else{
                currSeq=1;
                 while(set.contains(curr+1)){
                     curr++;
                     currSeq++;
                 }
                  answer=Math.max(currSeq,answer);
             }
            

         }

        return answer; //space complexity : O(n) and time complexity O(n)
    }
}