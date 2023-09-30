import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        //edge case
        if(s.length()==0&&t.length()==0){
            return true;
        }
        if(s.length()!=t.length()){
            return false;
        }
        //Brute force approach
        char [] sArray=s.toCharArray();
        char [] tArray=t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray);
    }
}