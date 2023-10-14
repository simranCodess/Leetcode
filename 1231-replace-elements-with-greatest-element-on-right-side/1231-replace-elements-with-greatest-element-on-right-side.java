class Solution {
    public int[] replaceElements(int[] arr) {
        int [] answer=new int[arr.length];
        if(arr.length==1){
            arr[0]=-1;
            return arr;
        }
        int last=arr[arr.length-1];
        answer[arr.length-1]=-1;
        answer[arr.length-2]=last;
        for(int i=arr.length-3; i>=0; i--){
            int nextBiggest=Math.max(answer[i+1],arr[i+1]);
            answer[i]=nextBiggest;
        }
        return answer;
    }
}