package dynamic_programming;

public class leetcode1130 {
    class Solution {
        public int mctFromLeafValues(int[] arr) {
            int n=arr.length;
            int[][] max=new int[n][n];
            int[][] dp=new int[n][n];
            int num=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    dp[i][j]=num;
                }
            }
            for(int i=0;i<n;i++){
                int m=arr[i];
                for(int j=i;j<n;j++){
                    m=Math.max(m,arr[j]);
                    max[i][j]=m;
                }
            }
            for(int i=0;i<n;i++){
                dp[i][i]=0;
            }
            for(int i=0;i<n-1;i++){
                dp[i][i+1]=arr[i]*arr[i+1];
            }
             for(int i = 2;i <= n; ++i){
                 for(int j = 0;i+j<n; ++j){
                     for(int k = j; k<i+j; ++k){
                         dp[j][j+i] = Math.min(dp[j][j+i],
                                               dp[j][k]+dp[k+1][i+j]+max[j][k]*max[k+1][i+j]);
                     }
                 }
             }
            return dp[0][n-1];
        }
    }
}
