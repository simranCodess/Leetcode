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

        /*optimal approach: HashMap 
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
        return true; //time complexity of O(n) and space complexity of O(c+d) where c is number of unique chars in s and d is number of unique chars in t*/

        //another clever optimal solution: storing the frequency of character in s and t in a 26 length array, where each index represents the letter from a to z
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