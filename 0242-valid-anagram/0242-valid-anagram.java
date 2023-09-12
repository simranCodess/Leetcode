
import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> myMap=new HashMap<>();

        for(int i=0; i<s.length(); i++){
            myMap.put(s.charAt(i),myMap.getOrDefault(s.charAt(i),0)+1);
        }

        for(int j=0; j<t.length(); j++){
            if(!myMap.containsKey(t.charAt(j))){
                return false;
            }
            myMap.put(t.charAt(j),myMap.getOrDefault(t.charAt(j),0)-1);
        }

        for(int n:myMap.values()){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}