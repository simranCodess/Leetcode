import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result=new ArrayList<>();
        //edge case
        if(strs.length==0){
            return result;
        }

        /*brute force method
        for(int i=0; i<strs.length; i++){
            String curr=strs[i];
            List<String> currentList=new ArrayList<>();
            boolean added=false;
            for(List<String> itterator: result){
                //in case a anagram for this word exists
                if(isAnagram(itterator.get(0),curr)){
                    itterator.add(curr);
                    added=true;
                    break;
                }
            }
            if(!added){
            //if it doesnt exist
            currentList.add(curr);
            result.add(currentList);
            }
        }
        return result; //time complexity of O(n*m^2) where n is length of strs and m is length of strings space complexity: O(1)*/


        // a optimal approch : use hashmap and store sorted anagram as key and a list of anagrams as values

        HashMap<String,List<String>> map=new HashMap<>();

        for(String s : strs){
            char [] curr=s.toCharArray();
            Arrays.sort(curr);
            String sorted=new String(curr);
            if(map.containsKey(sorted)){
                List<String> current=map.get(sorted);
                current.add(s);
                map.put(sorted,current);
            }
            else{
                List<String> newList=new ArrayList<>();
                newList.add(s);
                map.put(sorted,newList);
            }
        }

        for(List<String> value: map.values()){
            result.add(value);
        }
        return result;  //time complexity of O(n*m*log(m)) n=length of strs, m is the max length of string and m*log(m) 
        //because we are sorting each string. Space complexity will be O(n*m)  

    }
}