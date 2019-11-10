package weeklycontest;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目名称：重构 2 行二进制矩阵
 */
public class No5256 {
    class Solution {
        public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
            List<List<Integer>> res=new ArrayList<>();
            int[][] dp1=new int[2][colsum.length];
            // int[][] dp2=new int[2][colsum.length];
            int saveupper1=upper;
            int savelower1=lower;
            int save2=0;
            for(int i=0;i<colsum.length;i++){
                if(colsum[i]==2){
                    save2++;
                }
            }
            // int saveupper2=upper;
            // int savelower2=lower;
            for(int i=0;i<colsum.length;i++){
                if(colsum[i]==0){
                    dp1[0][i]=0;
                    dp1[1][i]=0;
                }else if(colsum[i]==2){
                    dp1[0][i]=1;
                    dp1[1][i]=1;
                    saveupper1--;
                    savelower1--;
                    save2--;
                }else{
                    if(saveupper1>0&&saveupper1>save2){
                        dp1[0][i]=1;
                        dp1[1][i]=0;
                        saveupper1--;
                    }else{
                        dp1[0][i]=0;
                        dp1[1][i]=1;
                        savelower1--;
                    }

                }
            }
            // System.out.println(saveupper1);
            // System.out.println(savelower1);
            if(saveupper1==0&&savelower1==0){
                for(int i=0;i<2;i++){
                    List<Integer> temp=new ArrayList<>();
                    for(int j=0;j<colsum.length;j++){
                        temp.add(dp1[i][j]);
                    }
                    res.add(temp);
                }
            }
            return res;



        }
    }
}
