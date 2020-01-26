package array;

import java.util.HashMap;
import java.util.Map;

public class leetcode1 {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],i);
            }
            for(int i=0;i<nums.length;i++){
                if(map.containsKey(target-nums[i])&&map.get(target-nums[i])!=i){
                    return new int[]{i,map.get(target-nums[i])};
                }
            }
            return new int[2];
        }
    }
}
