package dynamic_programming;

/**
 * 题解：
 * https://leetcode-cn.com/problems/maximum-product-subarray/solution/cheng-ji-zui-da-zi-shu-zu-by-leetcode-solution/
 */
public class leetcode152 {
    public int maxProduct(int[] nums) {
        int max=1;
        int min=1;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=max;
            max=Math.max(Math.max(nums[i]*min,nums[i]*max),nums[i]);
            min=Math.min(Math.min(nums[i]*min,nums[i]*temp),nums[i]);
            res=Math.max(res,max);
            // System.out.println(res);
        }
        return res;
    }
}
