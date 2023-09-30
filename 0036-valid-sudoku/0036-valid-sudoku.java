class Solution {
    public boolean isValidSudoku(char[][] board) {
        //brute force solution: going to check if a cell is not '.' and then compare ti with row, col and grid
        Set<String> set=new HashSet<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]!='.'){
                    int boxNum=(i/3)*3+j/3;
                    if(!set.add("ROW" + i + board[i][j])||!set.add("COL"+ j+board[i][j])||!set.add("BoxNum"+boxNum+board[i][j])){
                        return false;
                    }
                }
            }
        }

        return true;

    }
}