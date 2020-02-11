package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目：数组大小减半
 */
public class leetcode1338{
    class Solution {
        public int minSetSize(int[] arr) {
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<arr.length;i++){
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            int len=map.size();
            int[] num=new int[len];
            int start=0;
            for(Integer i:map.values()){
                num[start++]=i;
            }
            Arrays.sort(num);
            int res=0;
            int total=0;
            for(int i=num.length-1;i>=0;i--){
                total+=num[i];
                res++;
                if(total>=arr.length/2){
                    return res;
                }
            }
            return -1;
        }
    }
}
