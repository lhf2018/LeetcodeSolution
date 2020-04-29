package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode40 {
    class Solution {
        List<List<Integer>> res=new ArrayList<>();
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            helper(new ArrayList<Integer>(),candidates,0,0,target);
            return res;
        }
        public void helper(List<Integer> list,int[] candidates,int start,int count
                ,int target){
            if(count>target){
                return;
            }
            if(count==target){
                res.add(new ArrayList<>(list));
                return;
            }
            int pre=-1;
            for(int i=start;i<candidates.length;i++){
                if(candidates[i]!=pre){
                    list.add(candidates[i]);
                    helper(list,candidates,i+1,count+candidates[i],target);
                    list.remove(list.size()-1);
                    pre=candidates[i];
                }
            }
        }
    }
}
