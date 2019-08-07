package dfs;

import java.util.ArrayList;
import java.util.List;

public class leetcode17 {
    private List<String> res=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)return res;
        char[][] temp=new char[10][4];//存储数字对应的字母
        int len=digits.length();
        for(int i=2;i<7;i++){
            for(int j=0;j<3;j++){
                temp[i][j]=(char)('a'+((i-2)*3+j));
            }
        }
        temp[7]=new char[]{'p','q','r','s'};
        temp[8]=new char[]{'t','u','v'};
        temp[9]=new char[]{'w','x','y','z'};
        helper(digits,0,temp,len,"");
        return res;
    }
    /**
     *
     * @param index 查询到第几个数字
     * @param str 保存临时字符串
     */
    public void helper(String digits,int index,char[][] temp,int len,String str){
        if(index>=len){
            res.add(str);
            return;
        }
        for(int i=0;i<4;i++){
            int num=digits.charAt(index)-'0';
            if(i==3&&num!=9&&num!=7)continue;
            helper(digits,index+1,temp,len,str+""+temp[num][i]);
        }
    }
}
