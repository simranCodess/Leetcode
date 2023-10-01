class Solution {
    public int search(int[] nums, int target) {
        //using binary search to do this
        int left=0;
        int right=nums.length-1;
        int index=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                index=mid;
                break;
            }
             if(nums[mid]>=nums[left]){
                //sorted left half
                //checking if index exists in this half
                if(target>=nums[left]&&target<=nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
                }
                //checking if it exists in other half
                else{
                    if(target>=nums[mid]&&target<=nums[right]){
                        left=mid+1;;
                    }
                    else{
                        right=mid-1;
                    }
                }
            }
            return index; //time complexity of O(log n) and space of O(1)
            
        }
       
    }
