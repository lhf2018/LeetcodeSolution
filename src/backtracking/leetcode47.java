package backtracking;

import java.util.*;

public class leetcode47 {
    Set<List<Integer>> set=new HashSet<>();
    List<List<Integer>> res=new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        used=new boolean[nums.length];
        Arrays.sort(nums);
        helper(0,new ArrayList<>(),nums);
        res.addAll(set);
        return res;
    }
    public void helper(int index,List<Integer> list,int[] nums){
        if(index>=nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i!=0&&nums[i]==nums[i-1]&&!used[i-1]){
                continue;
            }
            if(!used[i]){
                used[i]=true;
                list.add(nums[i]);
                helper(index+1,list,nums);
                list.remove(list.size()-1);
                used[i]=false;
            }
        }
    }
}
