class Solution {
    public int finalValueAfterOperations(String[] operations) {
         int res=0;
        for(String curr: operations){
            if(curr.charAt(0)=='-'||curr.charAt(2)=='-'){
                res--;
            }
            else{
                res++;
            }
        }
        return res;
    }
}