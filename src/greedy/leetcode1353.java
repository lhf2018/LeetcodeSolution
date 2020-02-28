package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 题目：最多可以参加的会议数目
 */
public class leetcode1353 {
    class Solution {
        public int maxEvents(int[][] events) {
            Arrays.sort(events, new Comparator<int[]>() {
                public int compare(int[] o1, int[] o2) {
                    if(o1[1]!=o2[1]){
                        return o1[1]-o2[1];
                    }else{
                        return o1[0]-o2[0];
                    }
                }
            });
            int res=0;
            int[] temp=new int[events[events.length-1][1]+1];
            for(int i=0;i<events.length;i++){
                for(int j=events[i][0];j<=events[i][1];j++){
                    if(temp[j]==0){
                        temp[j]=1;
                        res++;
                        break;
                    }
                }
            }
            // for(int i=0;i<events.length;i++){
            //     System.out.println(events[i][0]+" "+events[i][1]);
            // }
            return res;
        }
    }
}
