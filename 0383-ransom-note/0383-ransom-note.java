import java.util.*;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }

        for(int i=0; i<ransomNote.length(); i++){
            int required=map.getOrDefault(ransomNote.charAt(i),0);
            if(required!=0){
                map.put(ransomNote.charAt(i),map.getOrDefault(ransomNote.charAt(i),0)-1);
            }
            else{
                return false;
            }
        }

        for(int i: map.values()){
            if(i<0){
                return false;
            }
        }
        return true;
    }
}