package backtracking;

import java.util.ArrayList;
import java.util.List;

public class leetcode22 {
    List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper(0,0,n,"");
        return res;
    }
    public void helper(int right,int left,int n,String str){
        if(right==n){
            res.add(str);
            return;
        }
        if(left<n){
            helper(right,left+1,n,str+"(");
        }
        if(right<left){
            helper(right+1,left,n,str+")");
        }
    }
}
