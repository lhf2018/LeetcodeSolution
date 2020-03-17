package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15 {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res=new ArrayList<>();
            Arrays.sort(nums);
            for(int i=0;i<nums.length-2;i++){
                if(i>0&&nums[i]==nums[i-1])continue;
                int target=-nums[i];
                int left=i+1;
                int right=nums.length-1;
                while(left<right){
                    int temp=nums[left]+nums[right];
                    if(temp==target){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        res.add(list);
                        left++;
                        right--;
                        while(left<nums.length&&nums[left]==nums[left-1])left++;
                        while(right>left&&nums[right]==nums[right+1])right--;
                    }else if(temp<target){
                        left++;
                    }else{
                        right--;
                    }
                }
            }
            return res;

        }
    }
}
