package array;

/**
 * 使用三个二维数组实现一次遍历完成查验这个数组
 */
public class leetcode36 {
    public boolean isValidSudoku(char[][] board) {
        //行
        int[][] r=new int[9][9];
        //列
        int[][] col=new int[9][9];
        //九格数组
        int[][] box=new int[9][9];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    r[i][board[i][j]-'1']++;
                    col[j][board[i][j]-'1']++;
                    int index=(i/3)*3+j/3;
                    box[index][board[i][j]-'1']++;
                    if(r[i][board[i][j]-'1']>1||col[j][board[i][j]-'1']>1
                            ||box[index][board[i][j]-'1']>1){
                        return false;
                    }
                }


            }
        }

        return true;

    }
}
