package array;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int len=res.size();

            for(int j=0;j<len;j++){
                List<Integer> temp=new ArrayList<>(res.get(j));
                temp.add(nums[i]);
                res.add(temp);
            }
        }
        return res;
    }
}
