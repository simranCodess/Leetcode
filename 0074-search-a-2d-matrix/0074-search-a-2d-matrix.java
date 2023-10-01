class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //first binary search to figure out which row we want, after we found the row, do binary search on that row to find the index 
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
            int middle=(high+low)/2;
            if(target>=matrix[middle][0]&&target<=matrix[middle][matrix[0].length-1]){
               break;
            }
            else if(target>matrix[middle][matrix[0].length-1]){
                low=middle+1;
            }
            else{
                high=middle-1;
            }
        }

        if(low>high){
            return false;
        }
        int row=(high+low)/2;
        int left=0;
        int right=matrix[row].length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(matrix[row][middle]==target){
                return true;
            }
            else if(matrix[row][middle]>target){
                right=middle-1;
            }
            else{
                left=middle+1;
            }
        }
        return false;
        
    }
}