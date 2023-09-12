import java.util.*;
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> myStack=new Stack<>();
        for(int i=0; i<s.length(); i++){
           if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
               myStack.push(s.charAt(i));
           }
           else{
            char curr=s.charAt(i);
           char next='c';
           if(myStack.empty()){
               return false;
           }
           next=myStack.pop();
           if(curr==')'&&next!='('){
               return false;
           }
           if(curr=='}'&&next!='{'){
               return false;
           }
           if(curr==']'&&next!='['){
               return false;
           }
           }
        }
        return myStack.isEmpty();
    }
}