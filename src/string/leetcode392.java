package string;

/**
 * 使用双指针，以s为基准，然后去查找长字符串符合条件的字母，如果不符合，指针移向下一个
 */
public class leetcode392 {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            if(s.length()==0)return true;
            if(t.length()==0)return false;
            int index=0;
            int num=0;
            char[] chs=s.toCharArray();
            char[] cht=t.toCharArray();
            int len=s.length();
            for(int i=0;i<len;i++){
                while(index<cht.length&&chs[i]!=cht[index]){
                    index++;
                }
                if(index==cht.length){
                    return false;
                }
                if(chs[i]==cht[index]){
                    num++;
                    index++;
                }
            }
            return num == chs.length;
        }
    }
}
