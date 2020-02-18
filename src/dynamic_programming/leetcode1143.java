package dynamic_programming;

public class leetcode1143 {
    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            char[] a=text1.toCharArray();
            char[] b=text2.toCharArray();
            int[][] dp=new int[a.length+1][b.length+1];
            int max=0;
            for(int i=1;i<=a.length;i++){
                for(int j=1;j<=b.length;j++){
                    if(a[i-1]==b[j-1]){
                        dp[i][j]=dp[i-1][j-1]+1;
                    }else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                    max=Math.max(dp[i][j],max);
                }
            }
            return max;
        }
    }
}
