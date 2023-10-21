import java.util.*;
class Solution {
    public int maxNumberOfBalloons(String text) {
        int result=Integer.MAX_VALUE;
        String balloon="balloon";
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> mapTwo=new HashMap<>();

        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)=='b'||text.charAt(i)=='a'||text.charAt(i)=='l'
            ||text.charAt(i)=='o'||text.charAt(i)=='n'){
            map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
            }
        }

        for(int i=0; i<balloon.length(); i++){
            mapTwo.put(balloon.charAt(i),mapTwo.getOrDefault(balloon.charAt(i),0)+1);
        }

        for (char c : "balon".toCharArray()) { 
            result = Math.min(result, map.getOrDefault(c, 0) / mapTwo.get(c));
        }
        return result;
    }
}