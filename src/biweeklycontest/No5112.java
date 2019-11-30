package biweeklycontest;

/**
 * 十六进制魔术数字
 */
public class No5112 {
    class Solution {
        public String toHexspeak(String num) {
            long n=Long.parseLong(num);
            String s=Long.toHexString(n);
            s=s.replaceAll("1","I");
            s=s.replaceAll("0","O");
            for(char c:s.toCharArray()){
                if(c-'0'>=2&&c-'0'<=9){
                    return "ERROR";
                }
            }
            return s.toUpperCase();
        }
    }
}
