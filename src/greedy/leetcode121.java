package greedy;

public class leetcode121 {
    class Solution {
        public int maxProfit(int[] prices) {
            int sum=0;
            int min=Integer.MAX_VALUE;
            for(int i=0;i<prices.length;i++){
                if(prices[i]>min){
                    sum=Math.max(sum,prices[i]-min);
                }
                min=Math.min(min,prices[i]);
            }

            return sum;

        }
    }
}
