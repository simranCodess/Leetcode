class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*brute force approach
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false; Time Complexity: O(n^2) Space Complexity: O(1)*/
        //optimal approach : use hashset
        HashSet<Integer> mySet=new HashSet<>();
        for(int i:nums){
            if(!mySet.add(i)){
                return true;
            }
        }
        return false; //Time Complexity: O(n) Space Complexity: O(n)
    }
}