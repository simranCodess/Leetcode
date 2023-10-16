import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder answer = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return "";
        }
        String first = strs[0];
        if (strs.length == 1) {
            return first;
        }
        if (first.length() == 0) {
            return "";
        }

        // Finding the minimum length string
        int len = first.length();
        for (String s : strs) {
            len = Math.min(len, s.length());
        }

        // Iterating only over the smallest length characters
        int index = 0;
        while (index < len) {
            char currentChar = first.charAt(index);
            for (String s : strs) {
                if (s.charAt(index) != currentChar) {
                    return answer.toString();
                }
            }
            answer.append(currentChar);
            index++;
        }

        return answer.toString();
    }
}
