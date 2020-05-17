package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
题解：https://leetcode-cn.com/problems/subarray-sum-equals-k/solution/he-wei-kde-zi-shu-zu-by-leetcode-solution/
**/
public class leetcode560 {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int pre=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            if(map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}
