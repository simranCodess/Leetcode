class Solution {
    public String longestPalindrome(String s) {
         if(s.length()==0){
            return "";
        }
        if(s.length()==1){
            return s;
        }

        String longestPalindrone="";
        int longest=0;

        for(int i=0; i<s.length(); i++){
            //odd length palindrones
            int left = i,right=i;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                if(right-left+1>longest){
                    longestPalindrone=s.substring(left,right+1);
                    longest=right-left+1;
                }
                left-=1;
                right+=1;
            }
            //even length
            left=i;
            right=i+1;
            while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
                if(right-left+1>longest){
                    longestPalindrone=s.substring(left,right+1);
                    longest=right-left+1;
                }
                left-=1;
                right+=1;
            }
        }


        return longestPalindrone;
    }
}