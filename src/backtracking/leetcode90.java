package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 利用回溯算法，排序排序之后，如果这个值与之前的值相同，就跳过
 */
public class leetcode90 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(0,nums,new ArrayList<Integer>());
        return res;
    }

    /**
     * 用来实现回溯
     * @param index 所处的位置
     */
    public void helper(int index,int[] nums,List<Integer> list){
        res.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++){
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            helper(i+1,nums,list);
            list.remove(list.size()-1);
        }
    }
}
