package dynamic_programming;

/**
 * 使用动态规划计算（i-j）*j和dp[j]*dp[i-j]的最大值
 */
public class leetcode343 {
    public int integerBreak(int n) {
        if(n==2)return 1;
        if(n==3)return 2;
        if(n==4)return 4;
        int[] dp=new int[n+1];
        dp[2]=1;
        dp[3]=2;
        dp[4]=4;
        for(int i=2;i<=n;i++){
            dp[i]=i;
        }
        for(int i=5;i<=n;i++){
            int max=0;
            int len=i/2+1;
            for(int j=2;j<len;j++){
                max=Math.max(max,Math.max((i-j)*j,dp[j]*dp[i-j]));
            }
            dp[i]=max;
        }
        return dp[n];
    }
}
