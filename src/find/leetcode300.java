package find;

/**
 * 二分查找
 */
public class leetcode300 {
    class Solution {
        public int lengthOfLIS(int[] nums) {
            if(nums.length<2)return nums.length;
            int[] tails=new int[nums.length];
            int res=1;
            tails[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                if(tails[res-1]<nums[i]){
                    tails[res]=nums[i];
                    res++;
                    continue;
                }
                int start=0;
                int end=res;
                while(start<end){
                    int mid=start+(end-start)/2;
                    if(tails[mid]<nums[i]){
                        start=mid+1;
                    }else{
                        end=mid;
                    }
                }
                tails[start]=nums[i];
            }
            return res;
        }
    }
}
