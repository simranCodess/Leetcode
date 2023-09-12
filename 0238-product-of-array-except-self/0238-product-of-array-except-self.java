class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] left= new int[nums.length];
        left[0]=1;
        int multiple=1;
        for(int i=1; i<nums.length; i++){
            multiple=multiple*nums[i-1];
            left[i]=multiple;
        }
        System.out.println(Arrays.toString(left));
        multiple=1;
        for(int j=nums.length-2; j>=0; j--){
            multiple=multiple*nums[j+1];
            left[j]*=multiple;
        }
        System.out.println(Arrays.toString(left));
        return left;
    }
}