import java.util.*;
class Solution {
    public boolean isSubsequence(String s, String t) {
        //has to be in order, the other string that is
        //using 2 pointer approach
        int i=0;
        int j=0;

        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        if(i<s.length()){
            return false;
        }
        return true;
    }
}