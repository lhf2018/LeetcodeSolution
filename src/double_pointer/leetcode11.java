package double_pointer;

/**
 * 使用了双指针，前后分别向前移动，两个之中小的那个向中间移动
 */
public class leetcode11 {
    class Solution {
        public int maxArea(int[] height) {
            int start=0;
            int end=height.length-1;
            int max=0;
            while(start<end){
                int temp=(end-start)*Math.min(height[start],height[end]);
                max=Math.max(max,temp);
                if(height[start]<height[end]){
                    start++;
                }else{
                    end--;
                }
            }
            return max;
        }
    }
}
