package array;

public class leetcode1295 {
    public int findNumbers(int[] nums) {
        int res=0;
        for(int num:nums){
            if((String.valueOf(num).length()&1)==0){
                res++;
            }
        }
        return res;
    }
}
