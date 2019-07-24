package dfs;

public class leetcode547 {
    /**
     * 方法一
     * 时间：66ms
     */
    public int findCircleNum(int[][] M) {
        int[][] visited=new int[M.length][M[0].length];
        int res=0;
        for(int i=0;i<M.length;i++){
            for(int j=0;j<M[0].length;j++){
                if(M[i][j]==1&&visited[i][j]==0){
                    res++;
                    helper(M,visited,i,j);
                }
            }
        }
        return res;
    }
    public void helper(int[][] M,int[][] visited,int row,int col){
        for(int i=0;i<visited.length;i++){
            if(visited[i][col]==1){
                continue;
            }
            visited[i][col]=1;
            if(M[i][col]==1){
                helper(M,visited,i,col);
            }
        }
        for(int i=0;i<visited[0].length;i++){
            if(visited[row][i]==1){
                continue;
            }
            visited[row][i]=1;
            if(M[row][i]==1){
                helper(M,visited,row,i);
            }
        }
    }
    /**
     * 方法二
     * 时间：3ms
     */
    public int findCircleNum2(int[][] M) {
        boolean[] visited=new boolean[M.length];
        int res=0;
        for(int i=0;i<M.length;i++){
            if(!visited[i]){
                dfs(M,visited,i);
                res++;
            }
        }
        return res;
    }
    public void dfs(int[][] M,boolean[] visited,int index){
        for(int i=0;i<M.length;i++){
            if(!visited[i]&&M[i][index]==1){
                visited[i]=true;
                dfs(M,visited,i);
            }
        }
    }
}
