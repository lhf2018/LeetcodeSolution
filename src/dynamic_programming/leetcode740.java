package dynamic_programming;

/**
 * leetcode 740. 删除与获得点数
 * 思路参考个人博客：https://blog.csdn.net/weixin_44128511/article/details/100657451
 */
public class leetcode740 {
    class Solution {
        public int deleteAndEarn(int[] nums) {
            //求nums最大值
            if(nums.length==0)return 0;
            int m=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                m=Math.max(m,nums[i]);
            }
            int[] temp=new int[m+1];
            for(int i=0;i<nums.length;i++){
                temp[nums[i]]++;
            }
            int[] dp=new int[m+1];
            dp[1]=temp[1];
            for(int i=2;i<dp.length;i++){
                dp[i]=Math.max(dp[i-2]+temp[i]*i,dp[i-1]);
            }
            return dp[m];
        }
    }

}
