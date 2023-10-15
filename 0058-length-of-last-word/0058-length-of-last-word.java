class Solution {
    public int lengthOfLastWord(String s) {
        int i=s.length()-1;
        if(s.length()==1){
            return 1;
        }
        while(i>=0){
            if(Character.isAlphabetic(s.charAt(i))){
                break;
            }
            i--;
        }
        //now i have the index of the last alphabetic char
        int answer=0;
        while(i>=0&&Character.isAlphabetic(s.charAt(i))){
            i--;
            answer++;
        }
        return answer;
    }
}