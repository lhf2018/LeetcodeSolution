package math;

public class leetcode633 {
    class Solution {
        public boolean judgeSquareSum(int c) {
            int temp=(int)(Math.sqrt(c));
            int left=0;
            int right=temp;
            while(left<=right){
                int sum=left*left+right*right;
                if(sum==c){
                    return true;
                }else if(sum<c){
                    left++;
                }else{
                    right--;
                }
            }
            return false;
        }
    }
}
