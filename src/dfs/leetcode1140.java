package dfs;

/**
 * 参考个人博客：https://blog.csdn.net/weixin_44128511/article/details/98617044
 */
public class leetcode1140 {
    private int n=0;
    private int[][] dp;
    public int stoneGameII(int[] piles) {
        n=piles.length;
        int[] s=new int[n];
        s[n-1]=piles[n-1];
        for(int i=n-2;i>=0;i--){
            s[i]=s[i+1]+piles[i];
        }
        dp=new int[2*n][2*n];
        return dfs(0,1,s);
    }
    public int dfs(int index,int M,int[] s){
        if(index>n){
            return 0;
        }else if(index+2*M>=n){
            return s[index];
        }else{
            int min=Integer.MAX_VALUE;
            for(int i=1;i<=2*M;i++){
                if(dp[index+i][Math.max(M,i)]!=0){
                    min=Math.min(min,dp[index+i][Math.max(M,i)]);
                }else{
                    int temp=dfs(index+i,Math.max(M,i),s);
                    min=Math.min(min,temp);
                    dp[index+i][Math.max(M,i)]=temp;
                }

            }
            return s[index]-min;
        }
    }
}
