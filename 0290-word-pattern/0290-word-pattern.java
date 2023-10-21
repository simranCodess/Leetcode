import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> mapTwo = new HashMap<>();
        String[] sArray = s.split(" ");

        if (pattern.length() != sArray.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
        
            if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(sArray[i])) {
                return false;
            }
            
            if(mapTwo.containsKey(sArray[i]) && !mapTwo.get(sArray[i]).equals(pattern.charAt(i))) {
                return false;
            }
            
            map.put(pattern.charAt(i),sArray[i]);
            mapTwo.put(sArray[i],pattern.charAt(i));
        }
        return true;
    }
}
