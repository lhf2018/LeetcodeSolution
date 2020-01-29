package biweeklycontest;

import java.util.ArrayList;
import java.util.List;

/**
 * 删除区间
 */
public class leetcode1272 {
    class Solution {
        public List<List<Integer>> removeInterval(int[][] intervals, int[] toBeRemoved) {
            int start=toBeRemoved[0];
            int end=toBeRemoved[1];
            List<List<Integer>> res=new ArrayList<>();

            for(int i=0;i<intervals.length;i++){

                if(intervals[i][0]<start){
                    List<Integer> list=new ArrayList<>();
                    list.add(intervals[i][0]);
                    list.add(Math.min(intervals[i][1],start));
                    res.add(list);
                }
                if(intervals[i][1]>end){
                    List<Integer> list=new ArrayList<>();
                    list.add(Math.max(intervals[i][0],end));
                    list.add(intervals[i][1]);
                    res.add(list);
                    continue;
                }

            }
            return res;
        }
    }
}
