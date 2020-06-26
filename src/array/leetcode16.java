package array;

import java.util.Arrays;

public class leetcode16 {
    public int threeSumClosest(int[] nums, int target) {
        int res=0;
        int dif=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                int temp=nums[i]+nums[start]+nums[end]-target;
                if(temp<0){
                    start++;
                }else if(temp>0){
                    end--;
                }else{
                    return target;
                }
                if(Math.abs(temp)<dif){
                    dif=Math.abs(temp);
                    res=temp+target;
                }
            }
        }
        return res;
    }
}
