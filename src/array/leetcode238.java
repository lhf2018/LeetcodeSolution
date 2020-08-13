package array;

public class leetcode238 {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]res=new int[n];
        for(int i=0,cur=1;i<n;i++){  // 累乘上该数字左边的值
            res[i]=cur;
            cur*=nums[i];
        }
        for(int i=n-1,cur=1;i>=0;i--){ // 累乘上该数字右边的值
            res[i]*=cur;
            cur*=nums[i];
        }
        return res;
    }
}
