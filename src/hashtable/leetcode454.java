package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * 使用hashmap实现
 */
public class leetcode454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                int sum=A[i]+B[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                //直接查找map中key为0-C[i]-D[j]的数量
                int sum=0-C[i]-D[j];
                res+=map.getOrDefault(sum,0);
            }
        }
        return res;
    }
}
