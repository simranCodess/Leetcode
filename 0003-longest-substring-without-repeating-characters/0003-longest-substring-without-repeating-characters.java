class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        if(s.length()==0){
            return 0;
        }
        String longestSeq=Character.toString(s.charAt(0));
        int maxLength=Integer.MIN_VALUE;
        int curr=1;
        
        for(int i=1; i<s.length(); i++){
            if(!longestSeq.contains(Character.toString(s.charAt(i)))){
                longestSeq+=s.charAt(i);
                curr++;
            }
            else{
                int indexRepeated=longestSeq.indexOf(s.charAt(i));
                longestSeq=longestSeq.substring(indexRepeated+1)+s.charAt(i);
                curr=longestSeq.length(); 
            }
            maxLength=Math.max(curr,maxLength);
            
        }
        return maxLength;
    }
}