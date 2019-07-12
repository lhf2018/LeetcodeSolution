package stack;

/**
 * 思路:https://blog.csdn.net/weixin_44128511/article/details/95620141
 */
public class leetcode856 {
    public int scoreOfParentheses(String S) {
        int res=0;
        int deep=-1;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                deep++;
            }
            if(S.charAt(i)==')'){
                deep--;
            }
            if(S.charAt(i)=='('&&S.charAt(i+1)==')'){
                res+=(int)(Math.pow(2,deep));
            }
        }
        return res;
    }
}
