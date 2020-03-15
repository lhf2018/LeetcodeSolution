package z_need_upgrade;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 统计每一列最大值，每一行最小值，取交集
 */
public class No5356 {
    class Solution {
        public List<Integer> luckyNumbers (int[][] matrix) {
            List<Integer> list=new ArrayList<>();
            Set<Integer> set_min=new HashSet<>();
            Set<Integer> set_max=new HashSet<>();
            for(int i=0;i<matrix.length;i++){
                int min=Integer.MAX_VALUE;
                for(int j=0;j<matrix[0].length;j++){
                    min=Math.min(min,matrix[i][j]);
                }
                set_min.add(min);
            }
            for(int i=0;i<matrix[0].length;i++){
                int max=Integer.MIN_VALUE;
                for(int j=0;j<matrix.length;j++){
                    max=Math.max(max,matrix[j][i]);
                }
                set_max.add(max);
            }
            for(Integer i:set_min){
                if(set_max.contains(i)){
                    list.add(i);
                }
            }
            return list;
        }
    }
}
