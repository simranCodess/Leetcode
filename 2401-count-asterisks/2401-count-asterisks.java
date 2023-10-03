class Solution {
    public int countAsterisks(String s) {
        //s=0
        if(s.length()==0){
            return 0;
        }
        if(!s.contains("*")){
            return 0;
        }


        int barCount=0;
        int astrickCount=0;

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='|'&&barCount==1){
                barCount--;
            }
            else if(c=='|'&&barCount==0){
                barCount++;
            }
            if(c=='*'&&barCount==0){
                astrickCount++;
            }
        }
        return astrickCount;
    }
}