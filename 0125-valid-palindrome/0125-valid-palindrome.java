class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        if(s.length()==1||s.length()==0){
            return true;
        }
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(Character.isLetterOrDigit(s.charAt(left))&&Character.isLetterOrDigit(s.charAt(right))){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                }
                 left++;
                 right--;
            }
            else if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
           
                
            
        }
        return true;
    }
}