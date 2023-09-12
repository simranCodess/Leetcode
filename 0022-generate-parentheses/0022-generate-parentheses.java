class Solution {
   
          public List<String> generateParenthesis(int n) {
        List<String> output=new ArrayList<>();
        backTrack(output,"",0,0,n);
        return output;
    }
    private void backTrack(List<String> output, String curr,int open,int closed, int max){
        if(curr.length()==max*2){
            output.add(curr);
            return;
        }
        if(open<max){
            backTrack(output,curr+"(",open+1,closed,max);
        }
         if(closed<open){
            backTrack(output,curr+")",open,closed+1,max);
        }


    }
    }
