package array;

import java.util.Arrays;

public class leetcode1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] arrs=new int[points.length];
        for(int i=0;i<points.length;i++){
            arrs[i]=points[i][0];
        }
        Arrays.sort(arrs);
        int max=0;
        for(int i=1;i<arrs.length;i++){
            max=Math.max(max,arrs[i]-arrs[i-1]);
        }
        return max;
    }
}
