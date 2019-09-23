package dynamic_programming;

/**
 * 思路：创建两个动态规划数组，一个持有股票的最大收益，另一个未持有股票的最大收益，即这一天卖出
 * 可以参考这个博客：https://zhuanlan.zhihu.com/p/46098185
 */
public class leetcode309 {
    class Solution {
        public int maxProfit(int[] prices) {
            if(prices.length<=1)return 0;
            if(prices.length==2)return prices[1]>prices[0]?prices[1]-prices[0]:0;
            int[] dp1=new int[prices.length];//持有股票的最大收益
            int[] dp2=new int[prices.length];//未持有股票的最大收益，即这一天卖出
            dp1[0]=-prices[0];
            for(int i=1;i<prices.length;i++){
                dp2[i]=Math.max(dp2[i-1],dp1[i-1]+prices[i]);
                if(i>1){
                    dp1[i]=Math.max(dp1[i-1],dp2[i-2]-prices[i]);
                }else{
                    dp1[i]=Math.max(dp1[i-1],-prices[i]);
                }

            }
            return Math.max(dp2[prices.length-1],dp1[prices.length-1]);
        }
    }
}
