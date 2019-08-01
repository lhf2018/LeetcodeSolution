package dynamic_programming;

/**
 * 利用动态规划
 * if i not in days
 * f(i)=f(i−1)  
 * else 
 * f(i)=min(f(i−1)+costs[0],f(i−7)+costs[1],f(i−30)+costs[i−30])
 * 注意边界条件
 */
public class leetcode983 {
    public int mincostTickets(int[] days, int[] costs) {
        int last=days[days.length-1];
        int[] dp=new int[last+1];
        int day=0;
        for(int i=1;i<=last;i++){
            if(i!=days[day]){
                dp[i]=dp[i-1];
            }else{
                dp[i]=dp[i-1]+costs[0];
                int temp1=costs[1]+(i>7?dp[i-7]:0);
                dp[i]=Math.min(dp[i],temp1);
                int temp2=costs[2]+(i>30?dp[i-30]:0);
                dp[i]=Math.min(dp[i],temp2);
                day++;
            }
        }
        return dp[last];
    }
}
