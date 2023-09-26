class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //edge cases
        if(nums.length==0||k==0){
            return new int[0];    
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        List<Integer> bucket[] =new ArrayList[nums.length+1];

        for(int i=0; i<nums.length; i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }

        for(int value: freq.keySet()){
            int frequency=freq.get(value);
            if(bucket[frequency]==null){
                List<Integer> myList=new ArrayList<>();
                myList.add(value);
                bucket[frequency]=myList;
            }
            else{
                List<Integer> myList=bucket[frequency];
                myList.add(value);
                bucket[frequency]=myList;
            }
        }
        int [] answer=new int[k];
        int index=0;

        for(int i=bucket.length-1; i>=0; i--){
            if(bucket[i]!=null){
                List<Integer> myList=bucket[i];
                for(int value: myList){
                    answer[index]=value;
                    index++;
                    if(index==k){
                        return answer;
                    }
                }
            }
        }
        
        return new int[0];
    }
}