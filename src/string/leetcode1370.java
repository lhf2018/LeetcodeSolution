package string;

public class leetcode1370 {
    public String sortString(String s) {
        int[] chs=new int[26];
        for(char c:s.toCharArray()){
            chs[c-'a']++;
        }
        int count=s.length();
        StringBuilder sb=new StringBuilder();
        while(count>0){
            for(int i=0;i<26;i++){
                if(chs[i]>0){
                    chs[i]--;
                    count--;
                    sb.append((char)(i+'a'));
                }
            }
            for(int i=25;i>=0;i--){
                if(chs[i]>0){
                    chs[i]--;
                    count--;
                    sb.append((char)(i+'a'));
                }
            }
        }
        return sb.toString();
    }
}
