package dynamic_programming;

/**
 * 题目：931. 下降路径最小和
 * 思路：
 * 1.建立动态规划的dp数组
 * 2.dp[i][j]代表到第(i，j)个位置的最短距离
 * 3.取最后一行的最小值
 */
public class leetcode931 {
    public int minFallingPathSum(int[][] A) {
        int[][] dp=new int[A.length][A[0].length];
        //赋初始值，第一行放入dp数组
        for(int i=0;i<A[0].length;i++){
            dp[0][i]=A[0][i];
        }
        for(int i=1;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(j==0){
                    dp[i][j]=Math.min(dp[i-1][j]+A[i][j],dp[i-1][j+1]+A[i][j]);
                    continue;
                }
                if(j==A[0].length-1){
                    dp[i][j]=Math.min(dp[i-1][j]+A[i][j],dp[i-1][j-1]+A[i][j]);
                    continue;
                }
                dp[i][j]=A[i][j]+Math.min(dp[i-1][j-1],
                        Math.min(dp[i-1][j],dp[i-1][j+1]));

            }
        }
        //取dp数组最后一行最小值
        int min=Integer.MAX_VALUE;
        for(int i=0;i<dp[0].length;i++){
            min=Math.min(min,dp[dp.length-1][i]);
        }
        return min;

    }
}
