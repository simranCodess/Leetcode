import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] answer=new int[k];
        //edge cases
        if(nums.length==0||k==0){
            return answer;
        }
        // optimal way using bucket, indexes as count numbers and fill the values that count upto that index
        List<Integer> [] bucket=new ArrayList[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
             Integer key = entry.getKey();
             Integer value = entry.getValue();
             if(bucket[value]==null){
                 bucket[value]=new ArrayList<>();
             }
             bucket[value].add(key);
        }
        int index=0;
       for(int i=bucket.length-1; i>=0 ; i--){
          if(bucket[i]!=null){
              List<Integer> curr=bucket[i];
              for(int j=0; j<curr.size(); j++){
                  answer[index++]=curr.get(j);
                  if(k==index){
                      break;
                  }
             }
          }
           if (index == k) {
        break;
    }
       }


        return answer; //time complexity of O(n) as well as space complexity O(n)
    }
}