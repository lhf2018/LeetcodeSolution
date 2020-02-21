package dynamic_programming;

public class leetcode5 {
    class Solution {
        public String longestPalindrome(String s) {
            if(s==null||s.length()==0)
                return "";
            int len=0;
            String res="";
            char[] ch=s.toCharArray();
            boolean[][] dp=new boolean[s.length()][s.length()];
            for(int j=0;j<s.length();j++){
                dp[j][j]=true;
                for(int i=0;i<=j;i++){
                    dp[i][j]=(ch[i]==ch[j])&&(j-i<2||dp[i+1][j-1]);
                    if(dp[i][j]&&j-i+1>len){
                        len=j-i+1;
                        res=s.substring(i,j+1);

                    }
                }
            }
            return res;
        }
    }
}
