package dynamic_programming;

/**
 * 维护两个数组hava，dont_have，前者表示当我们持有股票时的最大利润，后者表示当我们不持有股票时的最大利润。
 */
public class leetcode714 {
    public int maxProfit(int[] prices, int fee) {
        if (prices == null || prices.length == 0)
            return 0;
        int n = prices.length;
        int[] have = new int[n];
        int[] dont_have = new int[n];
        have[0] = have[0]-prices[0];
        for (int i = 1; i < n; i++) {
            //第i天手里有股票的最大收益：max（昨天有，昨天没有今天买了）
            have[i] = Math.max(have[i - 1], dont_have[i - 1] - prices[i]);
            //第i天手里没有股票的最大收益: max(昨天手里没有股票，昨天有今天卖了)
            dont_have[i] = Math.max(dont_have[i - 1], have[i-1] + prices[i] - fee);
        }
        return dont_have[n - 1];
    }
}
