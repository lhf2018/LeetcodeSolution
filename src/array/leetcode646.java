package array;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode646 {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,new Comparator<int[]>(){
            public int compare(int[] o1,int[] o2){
                return o1[1]-o2[1];
            }
        });
        int res=1;
        int temp=pairs[0][1];
        for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]>temp){
                res++;
                temp=pairs[i][1];
            }
        }
        return res;
    }
}
