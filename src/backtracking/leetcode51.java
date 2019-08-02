package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用回溯
 */
public class leetcode51 {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        int[][] num=new int[n][n];
        helper(num,0,n);
        return res;
    }
    //查找皇后解法
    public void helper(int[][] num,int index,int n){
        if(index>n-1){
            add(num);
            return;
        }
        for(int i=0;i<n;i++){
            if(check(num,index,i,n)){
                num[index][i]=1;
                helper(num,index+1,n);
                num[index][i]=0;
            }
        }
    }
    public boolean check(int[][] num,int row,int col,int n){
        //检查列
        for(int i=0;i<n;i++){
            if(num[i][col]==1){
                return false;
            }
        }
        //检查左对角线
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(num[i][j]==1){
                return false;
            }
        }
        //检查右对角线
        for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++){
            if(num[i][j]==1){
                return false;
            }
        }
        return true;
    }

    /**
     * 负责把num中数据存到list中，list存到res中
     * @param num
     */
    public void add(int[][] num){
        List<String> list=new ArrayList<>();
        for(int i=0;i<num.length;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<num.length;j++){
                if(num[i][j]==1){
                    sb.append("Q");
                }else{
                    sb.append(".");
                }
            }
            list.add(sb.toString());
        }
        res.add(new ArrayList<>(list));
    }
}
