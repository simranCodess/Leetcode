import java.util.*;
class Solution {
    public boolean lemonadeChange(int[] bills) {
        //creating three stacks
        Stack<Integer> fiveStack=new Stack<>();
        Stack<Integer> tenStack=new Stack<>();


        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                fiveStack.add(1);
            }
            else if(bills[i]==10){
                tenStack.add(1);
                if(fiveStack.empty()){
                    return false;
                }
                fiveStack.pop();
            }
            else if(bills[i]==20){
                if(fiveStack.empty()){
                    return false;
                }
                else if(tenStack.empty()&&fiveStack.size()<3){
                    return false;
                }
                else if(tenStack.empty()&&fiveStack.size()>=3){
                    fiveStack.pop();
                     fiveStack.pop();
                      fiveStack.pop();
                }
                else if(!tenStack.empty()&&fiveStack.size()>=1){
                    tenStack.pop();
                    fiveStack.pop();
                }

           }
            
        }
        return true;
    }
}