package sort;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode973 {
    public int[][] kClosest(int[][] points, int K) {
        int[][] temp=new int[points.length][3];
        for(int i=0;i<points.length;i++){
            temp[i][0]=points[i][0];
            temp[i][1]=points[i][1];
            temp[i][2]=temp[i][0]*temp[i][0]+temp[i][1]*temp[i][1];
        }
        Arrays.sort(temp,new Comparator<int[]>(){
            public int compare(int[] o1,int[] o2){
                return o1[2]-o2[2];
            }
        });
        int[][] res=new int[K][2];
        for(int i=0;i<K;i++){
            res[i][0]=temp[i][0];
            res[i][1]=temp[i][1];
        }
        return res;
    }
}
