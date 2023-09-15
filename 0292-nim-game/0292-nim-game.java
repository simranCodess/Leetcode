class Solution {
    public boolean canWinNim(int n) {
        if(n<4){
            return true;
        }
        if(n%4==1||n%4==3||n%4==2){
            return true;
        }
        return false;
    }
}