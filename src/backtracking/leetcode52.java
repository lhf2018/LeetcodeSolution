package backtracking;

public class leetcode52 {
    private int res=0;
    public int totalNQueens(int n) {
        int[][] num=new int[n][n];
        helper(num,0,n);
        return res;
    }
    public void helper(int[][] num,int index,int n){
        if(index>n-1){
            res++;
            return;
        }
        for(int i=0;i<n;i++){
            if(check(num,index,i,n)){
                num[index][i]=1;
                helper(num,index+1,n);
                num[index][i]=0;
            }
        }
    }

    /**
     * 检查是否出现冲突
     */
    public boolean check(int[][] num,int row,int col,int n){
        //检查列
        for(int i=0;i<n;i++){
            if(num[i][col]==1){
                return false;
            }
        }
        //检查左对角线
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(num[i][j]==1){
                return false;
            }
        }
        //检查右对角线
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(num[i][j]==1){
                return false;
            }
        }
        return true;
    }
}
