import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> answer=new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            String curr=strs[i];
             char tempArray[] = curr.toCharArray();
             Arrays.sort(tempArray);
             String sortedWord=new String(tempArray);
             List<String> myList=new ArrayList<>();
            if(map.containsKey(sortedWord)){
                myList=map.get(sortedWord);
                myList.add(curr);
                map.put(sortedWord,myList);
            }
            else{
                myList.add(curr);
                map.put(sortedWord,myList);
            }
        }

        for(List<String> currList: map.values()){
            answer.add(currList);
        }
        return answer;
        
    }
    public boolean isAnanagram(String a,String b){
        HashMap<Character,Integer> myTable=new HashMap<>();
        if(a.length()==0||b.length()==0){
            return false;
        }
        for(int i=0; i<a.length(); i++){
            myTable.put(a.charAt(i),myTable.getOrDefault(a.charAt(i),0)+1);
        }
        for(int i=0; i<b.length(); i++){
            myTable.put(b.charAt(i),myTable.getOrDefault(b.charAt(i),0)-1);
        }
        for(int i: myTable.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}