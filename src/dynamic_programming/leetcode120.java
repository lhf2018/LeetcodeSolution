package dynamic_programming;

import java.util.List;

public class leetcode120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp=new int[triangle.size()][triangle.size()];
        dp[0][0]=triangle.get(0).get(0);
        int res=Integer.MAX_VALUE;
        for(int i=1;i<triangle.size();i++){
            for(int j=0;j<=i;j++){
                if(j==0){
                    dp[i][j]=dp[i-1][j]+triangle.get(i).get(j);
                }else if(j==i){
                    dp[i][j]=dp[i-1][j-1]+triangle.get(i).get(j);
                }else{
                    dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j])+triangle.get(i).get(j);
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            res=Math.min(res,dp[dp.length-1][i]);
        }
        return res;
    }
}
