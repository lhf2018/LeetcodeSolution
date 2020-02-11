package array;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目：检查整数及其两倍数是否存在
 */
public class leetcode1346 {
    class Solution {
        public boolean checkIfExist(int[] arr) {
            Set<Integer> set=new HashSet<>();
            for(int i=0;i<arr.length;i++){
                if(set.contains(arr[i]*2)||(arr[i]%2==0&&set.contains(arr[i]/2))){
                    return true;
                }
                set.add(arr[i]);
            }
            return false;
        }
    }
}
