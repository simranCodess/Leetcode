class Solution {
    public boolean judgeCircle(String moves) {
         int xPos=0;
        int yPos=0;
        
        for(int i=0; i<moves.length(); i++){
            char currMove=moves.charAt(i);
            
            if(currMove=='U'){
                yPos++;
            }
            else if(currMove=='D'){
                yPos--;
            }
            else if(currMove=='L'){
                xPos--;
            }
            else if(currMove=='R'){
                xPos++;
            }
        }
        
        
        return xPos==0&&yPos==0;
    }
}