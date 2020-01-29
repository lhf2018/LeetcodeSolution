package weeklycontest;

/**
 *思路：分别比较两位
 *
 */
public class leetcode1318 {
    class Solution {
        public int minFlips(int a, int b, int c) {
            String str1=Integer.toBinaryString(a);
            String str2=Integer.toBinaryString(b);
            String str3=Integer.toBinaryString(c);
            for(int i=str1.length();i<=32;i++){
                str1="0"+str1;
            }
            for(int i=str2.length();i<=32;i++){
                str2="0"+str2;
            }
            for(int i=str3.length();i<=32;i++){
                str3="0"+str3;
            }
            int len=str3.length();
            int res=0;
            for(int i=0;i<len;i++){
                if(str3.charAt(i)=='0'){
                    if(str1.charAt(i)=='1'){
                        res++;
                    }
                    if(str2.charAt(i)=='1'){
                        res++;
                    }
                }else if(str3.charAt(i)=='1'){
                    if(str1.charAt(i)=='0'&&str2.charAt(i)=='0'){
                        res++;
                    }
                }
            }
            return res;
        }
    }
}
