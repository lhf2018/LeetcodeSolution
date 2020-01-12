package weeklycontest;

import java.util.HashSet;
import java.util.Set;

/**
 * 查看连通的集合数量num，结果为num-1，如果数量不够，直接返回-1
 */
public class No5309 {
    class Solution {
        public int makeConnected(int n, int[][] connections) {
            if(connections.length<n-1){
                return -1;
            }
            int[] nums=new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i]=i;
            }
            for(int i=0;i<connections.length;i++){
                if(nums[connections[i][0]]==nums[connections[i][1]]){
                    continue;
                }else{
                    int ff=nums[connections[i][0]];
                    nums[connections[i][0]]=nums[connections[i][1]];
                    for(int j=0;j<nums.length;j++){
                        if(nums[j]==ff){
                            nums[j]=nums[connections[i][1]];
                        }
                    }
                }
            }
            int num=0;
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(!set.contains(nums[i])){
                    num++;
                }
                set.add(nums[i]);
            }
            return num-1;
        }
    }
}
