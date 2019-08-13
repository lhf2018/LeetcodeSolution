package greedy;

/**
 * 题解：https://leetcode-cn.com/problems/gas-station/solution/jia-you-zhan-by-leetcode/
 */
public class leetcode134 {
    class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int total=0;//总油量
            int cur=0;//当前油量
            int res=0;//可以成功的坐标
            int len=gas.length;
            for(int i=0;i<len;i++){
                total+=(gas[i]-cost[i]);
                cur+=(gas[i]-cost[i]);
                if(cur<0){
                    cur=0;
                    res=i+1;
                }
            }
            if(total>=0){
                return res;
            }else{
                return -1;
            }
        }
    }
}
