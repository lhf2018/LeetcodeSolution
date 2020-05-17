package bit;

public class leetcode136 {
    class Solution {
        public int singleNumber(int[] nums) {
            int temp=0;
            for(int n:nums){
                temp^=n;
            }
            return temp;
        }
    }
}
