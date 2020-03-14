package array;

public class leetcode1013 {
    class Solution {
        public boolean canThreePartsEqualSum(int[] A) {
            int sum=0;
            for(int i=0;i<A.length;i++){
                sum+=A[i];
            }
            if(sum%3!=0){
                return false;
            }
            int start=0;
            int presum=0;
            while(start<A.length){
                presum+=A[start];
                if(presum==sum/3){
                    break;
                }
                start++;
            }
            int end=A.length-1;
            int postsum=0;
            while(end>=0){
                postsum+=A[end];
                if(postsum==sum/3){
                    break;
                }
                end--;
            }
            return end-start>1;
        }
    }
}
