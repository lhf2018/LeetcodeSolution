package math;

public class leetcode169 {
    class Solution {
        public int majorityElement(int[] nums) {
            int count=1;
            int num=nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]==num){
                    count++;
                }else{
                    count--;
                }
                if(count==0){
                    count=1;
                    num=nums[i+1];
                    i++;
                }
            }
            return num;

        }
    }
}
