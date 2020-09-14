package dfs;

public class leetcode79 {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(board,word,0,i,j,new boolean[board.length][board[0].length])){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board,String word,int index,int row,int col,boolean[][] used){
        if(index>=word.length())return true;
        if(row<0||row>=board.length||col<0||col>=board[0].length)return false;
        if(!used[row][col]){

            if(board[row][col]==word.charAt(index)){
                used[row][col]=true;
                boolean res= helper(board,word,index+1,row+1,col,used)
                        ||helper(board,word,index+1,row-1,col,used)
                        ||helper(board,word,index+1,row,col+1,used)
                        ||helper(board,word,index+1,row,col-1,used);
                used[row][col]=false;
                return res;
            }
        }
        return false;

    }
}
