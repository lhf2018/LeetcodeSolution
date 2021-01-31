package string;

public class leetcode1576 {
    public String modifyString(String s) {
        char[] chs=s.toCharArray();
        for(int i=0;i<chs.length;i++){
            if(chs[i]=='?'){
                char temp='a';
                while((i<chs.length-1&&temp==chs[i+1])||(i>0&&temp==chs[i-1])){
                    temp++;
                }
                chs[i]=(char)(temp);
            }
        }
        return new String(chs);
    }
}
