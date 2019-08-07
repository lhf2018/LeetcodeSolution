package array;

/**
 * 计算环的最大长度，使用暴力破解的方式，没有重复的值就意味着不会出现两个数指向同一个值，就不会出项在中间打出一个环
 * 所以每个元素都属于一个环，每个环只计算一次
 *
 * 找一个Boolean型数组，如果已经被访问过了，结果会和以前出现过的答案相同，则认为不可能出现比当前最大值更大的环了
 */
public class leetcode565 {
    public int arrayNesting(int[] nums) {
        int max=0;
        boolean[] flag=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(max>nums.length/2)return max;
            if(flag[i])continue;
            int temp=1;
            int cur=nums[nums[i]];
            flag[i]=true;
            while(nums[i]!=cur){
                flag[cur]=true;
                temp++;
                cur=nums[cur];
            }
            max=Math.max(max,temp);
        }
        return max;
    }
}
