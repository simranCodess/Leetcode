import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        //edge case
        if(strs.length==0){
            return result;
        }

        //brute force method
        for(int i=0; i<strs.length; i++){
            String curr=strs[i];
            List<String> currentList=new ArrayList<>();
            boolean added=false;
            for(List<String> itterator: result){
                //in case a anagram for this word exists
                if(isAnagram(itterator.get(0),curr)){
                    itterator.add(curr);
                    added=true;
                    break;
                }
            }
            if(!added){
            //if it doesnt exist
            currentList.add(curr);
            result.add(currentList);
            }
        }
        return result; //time complexity of O(n*m^2) where n is length of strs and m is length of strings space complexity: O(1)
    }

    public boolean isAnagram(String s, String t){
         if(s.length()==0&&t.length()==0){
            return true;
        }
        if(s.length()!=t.length()){
            return false;
        }
        int[] seq=new int[26];
        for(int i=0; i<s.length(); i++){
            seq[s.charAt(i)-'a']++;
             seq[t.charAt(i)-'a']--;
        }
        for(int i:seq){
            if(i!=0){
                return false;
            }
        }
        return true;  //time complexity of O(n) and space complexity of O(1)
    }
}