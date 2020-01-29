package weeklycontest;

/**
 * 5274. 停在原地的方案数
 */
public class leetcode1269 {
    class Solution {
        public int numWays(int steps, int arrLen) {
            int mod = 1000000007;
            arrLen=Math.min(steps+1,arrLen);
            long[][] dp=new long[505][505];
            dp[0][0]=1;
            for(int i=1;i<=steps;i++){
                for(int j=0;j<arrLen;j++){
                    dp[i][j]=dp[i-1][j];
                    if(j>0){
                        dp[i][j]+=dp[i-1][j-1];
                    }
                    if(j!=arrLen-1){
                        dp[i][j]+=dp[i-1][j+1];
                    }
                    dp[i][j]=dp[i][j]%mod;
                }
            }
            return (int)(dp[steps][0]%mod);
        }
    }

}
