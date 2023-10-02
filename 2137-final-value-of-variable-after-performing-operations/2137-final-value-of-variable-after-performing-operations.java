class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for(String curr: operations){
            if(curr.contains("-")){
                res--;
            }
            else{
                res++;
            }
        }
        return res;
    }
}