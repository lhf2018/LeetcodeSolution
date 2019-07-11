package dynamic_programming;

/**
 * 使用动态规划dp[i]表示A的前i-1个的最大值
 * 取j从1到K：
 *  计算前[i-j,i]之间的最大值
 *  取dp[i-j]+max*j的最大值
 */
public class leetcode1043 {
    public int maxSumAfterPartitioning(int[] A, int K) {
        int n=A.length;
        int[] dp=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int max=-1;
            for(int j=1;j<=K&&i-j>=0;j++){
                max=Math.max(max,A[i-j]);
                dp[i]=Math.max(dp[i],dp[i-j]+max*j);
            }
        }
        return dp[n];

    }
}
