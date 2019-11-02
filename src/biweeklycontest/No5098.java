package biweeklycontest;

import java.util.*;

/**
 * 题目：树的直径
 * 思路：两次bfs，一次任取一点找到最远值，一次从这个最远点寻找最远值
 */
public class No5098 {
    class Solution {
        int max=0;
        int first=0;
        public int treeDiameter(int[][] edges) {
            Map<Integer, List<Integer>> map=new HashMap<>();
            for(int i=0;i<edges.length;i++){
                List<Integer> l1=map.getOrDefault(edges[i][0],new ArrayList<>());
                l1.add(edges[i][1]);
                map.put(edges[i][0],l1);
                List<Integer> l2=map.getOrDefault(edges[i][1],new ArrayList<>());
                l2.add(edges[i][0]);
                map.put(edges[i][1],l2);
            }
            // for(int i=0;i<list.size();i++){
            //     System.out.println(list.get(i));
            // }
            helper(map,edges[0][0],0,new HashSet<>(),map.size());
            System.out.print(first);
            helper(map,first,0,new HashSet<>(),map.size());
            return max;
        }
        public void helper(Map<Integer,List<Integer>> map,int cur,int num,Set<Integer> set,int all){
            if(num+all-set.size()<max){
                return;
            }
            if(set.contains(cur)){
                // System.out.println("++");
                if(num>max){
                    first=cur;
                }
                max=Math.max(num,max);
                return;
            }else{
                List<Integer> list=map.get(cur);
                // for(int i=0;i<list.size();i++){
                //     System.out.println(cur+"----"+list.get(i));
                // }

                set.add(cur);
                for(int i=0;i<list.size();i++){
                    helper(map,list.get(i),num+1,set,all);
                }
            }
        }
    }
}
