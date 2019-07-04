package dfs;

/**
 * 思路：使用深度优先搜索
 */
public class leetcode695 {
    int res=0;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int sum=helper(grid,i,j);
                res=Math.max(sum,res);
            }
        }
        return res;
    }
    public int helper(int[][] grid,int i,int j){
        int sum=0;
        if(grid[i][j]==1){
            sum=1;
            grid[i][j]=0;
            if(i+1<grid.length&&grid[i+1][j]==1){
                sum+=helper(grid,i+1,j);
            }
            if(i-1>=0&&grid[i-1][j]==1){
                sum+=helper(grid,i-1,j);
            }
            if(j+1<grid[0].length&&grid[i][j+1]==1){
                sum+=helper(grid,i,j+1);
            }
            if(j-1>=0&&grid[i][j-1]==1){
                sum+=helper(grid,i,j-1);
            }
        }
        return sum;
    }
}
