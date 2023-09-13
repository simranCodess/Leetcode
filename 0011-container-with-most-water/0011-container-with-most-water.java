class Solution {
    public int maxArea(int[] height) {
         int leftPtr=0;
        int rightPtr=height.length-1;
        int maxVolume=Integer.MIN_VALUE;
         int currVolume=0;
        while(leftPtr<rightPtr){
           
            if(height[leftPtr]<height[rightPtr]){
                //left will be the height
                currVolume=(rightPtr-leftPtr)*height[leftPtr];
                leftPtr++;
            }
            else{
            currVolume = (rightPtr - leftPtr) * height[rightPtr];
            rightPtr--;
            }
            maxVolume=Math.max(currVolume,maxVolume);
        }
        return maxVolume;
    }
}