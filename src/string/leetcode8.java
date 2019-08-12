package string;

public class leetcode8 {
    class Solution {
        public int myAtoi(String str) {
            str=str.trim();
            if(str.length()==0)return 0;
            int sign=1;//判断正负
            int index=0;
            if(str.charAt(index)=='+'){
                index++;
            }else if(str.charAt(index)=='-'){
                sign=-1;
                index++;
            }
            int res=0;
            while(index<str.length()){
                int temp=str.charAt(index)-'0';
                if(temp<0||temp>9)break;
                if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&temp>7)){
                    return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                res=res*10+temp;
                index++;
            }
            return sign*res;
        }
    }
}
