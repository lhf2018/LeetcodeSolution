package string;

/**
 * 题目：制造字母异位词的最小步骤数
 */
public class leetcode1347 {
    class Solution {
        public int minSteps(String s, String t) {
            int[] nums=new int[26];
            for(char c:s.toCharArray()){
                nums[c-'a']++;
            }
            for(char c:t.toCharArray()){
                if(nums[c-'a']>0){
                    nums[c-'a']--;
                }
            }
            int res=0;
            for(int i=0;i<nums.length;i++){
                res+=nums[i];
            }
            return res;
        }
    }
}
