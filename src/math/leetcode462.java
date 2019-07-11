package math;
/**
 * 思路：最小步数是所有点移动到中位数，先对数组排序，取中间值，然后遍历以后相加每一位数与中位数的差值的绝对自
 */

import java.util.Arrays;

public class leetcode462 {
    class Solution {
        public int minMoves2(int[] nums) {
            int n=(nums.length+1)/2;
            Arrays.sort(nums);
            int temp=nums[n-1];
            int res=0;
            for(int i=0;i<nums.length;i++){
                res+=Math.abs(nums[i]-temp);
            }
            return res;
        }
    }
}
