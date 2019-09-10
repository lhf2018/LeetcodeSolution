package string;

import java.util.Arrays;
import java.util.List;

/**
 * 把每个时间记成数字，排序，然后比较临近两数字的距离，同时也要比较数组首末两个数字的差值大小
 */
public class leetcode539 {
    class Solution {
        public int findMinDifference(List<String> timePoints) {
            int res=Integer.MAX_VALUE;
            int n=timePoints.size();
            int[] list=new int[timePoints.size()];
            for(int i=0;i<n;i++){
                String temp=timePoints.get(i);
                list[i]=(temp.charAt(0)-'0')*600+(temp.charAt(1)-'0')*60+temp.charAt(3)*10+temp.charAt(4);
            }
            Arrays.sort(list);
            res=24*60-(list[list.length-1]-list[0]);
            for(int i=0;i<n-1;i++){
                int temp=list[i+1]-list[i];
                res=Math.min(res,Math.min(temp,24*60-temp));
            }

            return res;
        }
    }
}
