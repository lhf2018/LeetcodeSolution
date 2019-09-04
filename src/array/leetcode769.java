package array;

public class leetcode769 {
    /**
     * 区间的最大值小于边界右边的索引，当到达索引，那么res++
     */
    class Solution {
        public int maxChunksToSorted(int[] arr) {
            int res=0;
            int index=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>index){
                    index=arr[i];
                }
                if(i==index){
                    res++;
                }
            }
            return res;
        }
    }
}
