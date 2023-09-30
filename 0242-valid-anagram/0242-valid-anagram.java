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
        /*Brute force approach
        char [] sArray=s.toCharArray();
        char [] tArray=t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray,tArray); //Time Complexity: O(n log n) Space Complexity: O(n)*/

        //optimal approach: HashMap
        HashMap<Character,Integer> myMap=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            myMap.put(s.charAt(i),myMap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0; i<t.length(); i++){
            myMap.put(t.charAt(i),myMap.getOrDefault(t.charAt(i),0)-1);
        }
        for(int value : myMap.values()){
            if(value!=0){
                return false;
            }
        }
        return true;

    }
}