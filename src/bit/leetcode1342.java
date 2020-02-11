package bit;

public class leetcode1342 {
    class Solution {
        public int numberOfSteps (int num) {
            int res=0;
            while(num!=0){
                if((num&1)==0){
                    num=num>>1;
                }else{
                    num-=1;
                }
                res++;
            }
            return res;
        }
    }
}
