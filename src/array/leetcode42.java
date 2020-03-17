package array;

public class leetcode42 {
    class Solution {
        public int trap(int[] height) {
            int[] pre=new int[height.length];
            int[] post=new int[height.length];
            for(int i=0;i<height.length;i++){
                if(i==0){
                    pre[i]=height[i];
                    post[height.length-1-i]=height[height.length-1-i];
                }else{
                    pre[i]=Math.max(height[i],pre[i-1]);
                    post[height.length-1-i]=Math.max(height[height.length-1-i],post[height.length-i]);
                }
            }
            int sum=0;
            for(int i=1;i<height.length-1;i++){
                int temp=Math.min(pre[i],post[i]);
                if(temp>height[i]){
                    sum+=(temp-height[i]);
                }
            }
            return sum;
        }
    }
}
