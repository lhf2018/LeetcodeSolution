package array;

import java.util.*;

/**
 * 题目：方阵中战斗力最弱的 K 行
 */
public class leetcode1337 {
    class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            List<Integer> list=new ArrayList<>();
            Map<Integer,List<Integer>> map=new HashMap<>();
            int[] res=new int[k];
            for(int i=0;i<mat.length;i++){
                int num=0;
                for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j]==1){
                        num++;
                    }
                }
                list.add(num);
                List<Integer> ll=map.getOrDefault(num,new ArrayList<>());
                ll.add(i);
                Collections.sort(ll);
                map.put(num,ll);
            }
            Collections.sort(list);
            int n=0;
            for(int i=0;i<k;i++){
                res[n++]=map.get(list.get(i)).get(0);
                List<Integer> ll=map.get(list.get(i));
                ll.remove(0);
                map.put(list.get(i),ll);
            }
            return res;

        }
    }
}
