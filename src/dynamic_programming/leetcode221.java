package dynamic_programming;

public class leetcode221 {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)return 0;
        int[][] dp=new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0||j==0){
                    dp[i][j]=matrix[i][j]-'0';
                }else if(matrix[i][j]=='1'){
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i-1][j-1]),dp[i][j-1])+1;
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        return max*max;
    }
}
