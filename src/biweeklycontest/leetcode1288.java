package biweeklycontest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1288 删除被覆盖区间
 * 重写comparator接口，排序intervals数组，大的下边界在前面，同等下边界，大的上边界在前面，这样被包含的都在后面
 */
public class leetcode1288 {
    class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
            Arrays.sort(intervals,new Comparator<int[]>(){
                public int compare(int[] o1,int[] o2){
                    if(o1[0]!=o2[0]){
                        return o1[0]-o2[0];
                    }else{
                        return o2[1]-o1[1];
                    }
                }
            });
            int high=intervals[0][1];
            int res=1;
            for(int i=1;i<intervals.length;i++){
                if(intervals[i][1]>high){
                    res++;
                    high=intervals[i][1];
                }
            }
            return res;
        }
    }
}
