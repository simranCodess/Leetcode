class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //merge 2 arrays in an increasing order
        int firstIndex=m-1;
        int secondIndex=n-1;
        int mergedIndex=m+n-1;

        while(firstIndex>=0&&secondIndex>=0){
            if(nums1[firstIndex]<nums2[secondIndex]){
                nums1[mergedIndex]=nums2[secondIndex];
                secondIndex--;
                mergedIndex--;
            }
            else{
                nums1[mergedIndex]=nums1[firstIndex];
                nums1[firstIndex]=nums2[secondIndex];
                firstIndex--;
                mergedIndex--;
            }
        }

        while(secondIndex>=0){
            nums1[mergedIndex]=nums2[secondIndex];
            secondIndex--;
            mergedIndex--;
        }
    }
}