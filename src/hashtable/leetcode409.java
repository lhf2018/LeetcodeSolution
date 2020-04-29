package hashtable;

public class leetcode409 {
    class Solution {
        public int longestPalindrome(String s) {
            if(s==null||s.length()==0)return 0;
            int[] nums=new int[128];
            for(int i=0;i<s.length();i++){
                nums[s.charAt(i)]++;
            }
            boolean flag=false;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=(nums[i]/2)*2;
                if(!flag&&nums[i]%2==1){
                    sum+=1;
                    flag=true;
                }
            }
            return sum;
        }
    }
}
