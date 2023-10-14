class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] answer=new int[2*nums.length];

        for(int i=0; i<answer.length; i++){
            answer[i]=nums[i%nums.length];
        }
        return answer;
    }
}