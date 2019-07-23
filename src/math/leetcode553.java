package math;

/**
 * 被除数最大，除数最小，那么被除数就是第一个，除数就是剩下的全部数
 * 括号在固定位置
 */
public class leetcode553 {
    public String optimalDivision(int[] nums) {
        if(nums.length==1)return String.valueOf(nums[0]);
        if(nums.length==2)return String.valueOf(nums[0])+"/"+String.valueOf(nums[1]);
        StringBuilder sb=new StringBuilder();
        sb.append(nums[0]).append("/(");
        for(int i=1;i<nums.length-1;i++){
            sb.append(nums[i]).append("/");
        }
        sb.append(nums[nums.length-1]).append(")");
        return sb.toString();
    }
}
