package array;

public class leetcode344 {
    class Solution {
        public void reverseString(char[] s) {
            char c=' ';
            for(int i=0;i<s.length/2;i++){
                c=s[i];
                s[i]=s[s.length-1-i];
                s[s.length-1-i]=c;
            }
        }
    }
}
