package array;

import java.util.*;

/**
 * hashmap统计arr1中每一个元素的数量，然后遍历arr2，写入对应数量的元素到arr1中，
 * 然后在hashmap中删除这个key值，然后把剩余的元素放入list，排序，最后放入arr1
 */
public class leetcode1122 {
    /**
     * Solution
     */
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            List<Integer> list=new ArrayList<>();
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<arr1.length;i++){
                map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
            }
            int index=0;
            for(int i=0;i<arr2.length;i++){
                int num=map.get(arr2[i]);
                for(int j=0;j<num;j++){
                    arr1[index++]=arr2[i];
                }
                map.remove(arr2[i]);
            }
            for(int num:map.keySet()){
                int num1=map.get(num);
                for(int i=0;i<num1;i++)list.add(num);
            }
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                arr1[index++]=list.get(i);
            }
            return arr1;
        }
    }
}
