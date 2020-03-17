package string;

public class leetcode6 {
    class Solution {
        public String convert(String s, int numRows) {
            StringBuilder[] res=new StringBuilder[numRows];
            for(int i=0;i<res.length;i++)res[i]=new StringBuilder();
            if(s.length()==1||numRows==1)return s;
            int hash=numRows*2-2;
            for(int i=0;i<s.length();i++){
                if(i%hash<numRows){
                    res[i%hash].append(s.charAt(i));
                }else{
                    res[2*numRows-2-i%hash].append(s.charAt(i));
                }
            }
            String str="";
            for(int i=0;i<res.length;i++){
                str+=res[i].toString();
            }
            return str;
        }
    }
}
