class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] answer=new int[nums.length];
        //edge case
        if(nums.length==0){
            return answer;
        }

        /*brute force
        for(int i=0; i<nums.length; i++){
            answer[i]=1;
        }
        for(int i=0; i<nums.length; i++){
            int curr=nums[i];
            for(int j=0; j<nums.length; j++){
                if(j==i){
                    continue;
                }
                answer[i]*=nums[j];
            }
        }
        return answer;*/ //very slow solution, time complexity of O(n^2) and space complexity of O(n)

        //optimal solution : use left and right product array and then multiply those
        int [] leftProduct=new int[nums.length];
        int [] rightProduct=new int[nums.length];
        
        leftProduct[0]=1;
        rightProduct[nums.length-1]=1;

        int left=1;
        int right=1;
        for(int i=1; i<nums.length; i++){
            left*=nums[i-1];
            leftProduct[i]=left;
        }

        for(int i=nums.length-2; i>=0; i--){
            right*=nums[i+1];
            rightProduct[i]=right;
        }

        System.out.println(Arrays.toString(rightProduct));
                System.out.println(Arrays.toString(leftProduct));

        for(int i=0; i<nums.length; i++){
            answer[i]=leftProduct[i]*rightProduct[i];
        }
       

        return answer;

    }
}