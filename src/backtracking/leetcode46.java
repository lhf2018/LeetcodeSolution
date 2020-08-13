package backtracking;

import java.util.ArrayList;
import java.util.List;

public class leetcode46 {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(new ArrayList<>(),new boolean[nums.length],0,nums);
        return res;
    }
    public void helper(List<Integer> list,boolean[] used,int count,int[] nums){
        if(count==used.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<used.length;i++){
            if(!used[i]){
                used[i]=true;
                list.add(nums[i]);
                helper(list,used,count+1,nums);
                list.remove(list.size()-1);
                used[i]=false;
            }
        }
    }
}
