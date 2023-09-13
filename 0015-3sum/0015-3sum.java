import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
        List<List<Integer>> answer=new LinkedList<>();

        for(int i=0; i<nums.length-2; i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }

                int left=i+1;
                int right=nums.length-1;
                int sum=0-nums[i];
                while(left<right){
                    if(nums[left]+nums[right]==sum){
                        answer.add(Arrays.asList(nums[left],nums[i],nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(nums[left]+nums[right]>sum){
                        right--;
                    }
                    else if(nums[left]+nums[right]<sum){
                        left++;
                    }

            }
        }

        return answer;
}
}