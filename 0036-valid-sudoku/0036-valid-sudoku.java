class Solution {
    public boolean isValidSudoku(char[][] board) {
        //optimal solution: going to check if a cell is not '.' and then compare ti with row, col and grid
        Set<String> set=new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    int boxNum=(i/3)*3+j/3;
                    if(!set.add("ROW" + i + board[i][j])||!set.add("COL"+ j+board[i][j])||!set.add("BoxNum"+boxNum+board[i][j])){
                        return false;
                    }
                }
            }
        }

        return true; //time complexity : O(n^2) and space complexity ~ O(81) which is constant so O(1)


    }
}