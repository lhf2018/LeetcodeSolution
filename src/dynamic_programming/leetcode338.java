package dynamic_programming;

/**
 * 状态转移方程：dp[i]=dp[i/2]+i%2;
 *
 */
public class leetcode338 {
    class Solution {
        public int[] countBits(int num) {
            int[] dp=new int[num+1];
            dp[0]=0;
            for(int i=0;i<=num;i++){
                dp[i]=dp[i/2]+i%2;
            }
            return dp;
        }
    }
}
