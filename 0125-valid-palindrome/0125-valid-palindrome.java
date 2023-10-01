class Solution {
    public boolean isPalindrome(String s) {
        //edge case
        if(s.length()==0||s.length()==0){
            return true;
        }

        s=s.toLowerCase();

        int left=0;
        int right=s.length()-1;

        while(left<=right){
            if(Character.isLetterOrDigit(s.charAt(left))&&Character.isLetterOrDigit(s.charAt(right))){
                if(s.charAt(left)!=s.charAt(right)){
                    return false;
                }
            }
            else if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            left++;
            right--;
        }
        return true; //time complexity of O(n) and space complexity of O(1)
    }
}