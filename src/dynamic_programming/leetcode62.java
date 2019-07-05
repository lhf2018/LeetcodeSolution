package dynamic_programming;

/**
 * 1.建立m*n的数组,数组的每一位的值代表到这一点不同的路径数
 * 2.赋初始值，第一行和第一列的路径只有一条，所以赋值为1
 * 3.剩余dp[i][j]的值为到左边格子的路径数+到上面格子的路径数
 * 4.返回dp[m-1][n-1]
 */
public class leetcode62 {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
