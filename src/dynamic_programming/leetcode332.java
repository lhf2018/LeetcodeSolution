package dynamic_programming;

public class leetcode332 {
    class Solution {
        public int coinChange(int[] coins, int amount) {
            if(amount==0)return 0;
            int[] dp=new int[amount+1];
            for(int i=1;i<dp.length;i++){
                int min=Integer.MAX_VALUE;
                for(int j:coins){
                    if(i-j>=0&&dp[i-j]!=-1){
                        min=Math.min(min,dp[i-j]+1);
                    }
                }
                dp[i]=min==Integer.MAX_VALUE?-1:min;
            }
            return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
        }
    }
}
