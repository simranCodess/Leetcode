import java.util.*;
class TimeMap {
     HashMap<String,List<Values>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        Values val=new Values(value,timestamp);
        map.get(key).add(val);
    }
    
    public String get(String key, int timestamp) {
        String res="";
        if(!map.containsKey(key)){
            return "";
        }
        else{
            List<Values> value=map.get(key);
            int left=0;
            int right=value.size()-1;
            //a binary search algorthm to find the value that is closest to target, but smaller then it
            while(left<=right){
                int mid=(left+right)/2;
                if(value.get(mid).getInt()<=timestamp){
                    res= value.get(mid).getValueStr();
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return res; //space complexity is O(n + m), and the time complexity is O(log m) for the get method and O(1) for the set method on average. n=num keys and m is average value timstamp pairs
    }
}

class Values{
    String str;
    int num;
    public Values(String str, int num){
        this.str=str;
        this.num=num;
    }
    public String getValueStr(){
        return str;
    }
    public int getInt(){
        return num;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */