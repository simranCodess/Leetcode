import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer=new ArrayList<>();
        if(numRows==0){
            return answer;
        }
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        answer.add(firstRow);
        for(int i=1; i<numRows; i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j>0 && i>0 && answer.get(i-1).size()-1>=j){
                    list.add(answer.get(i-1).get(j-1)+answer.get(i-1).get(j));
                } else{
                    list.add(1);
                }
            }
            answer.add(list);
        }
        return answer;
    }
}