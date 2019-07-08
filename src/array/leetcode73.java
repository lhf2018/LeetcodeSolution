package array;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode73. 矩阵置零
 * 使用两个list存储为0的x坐标和y坐标，然后从list中取出来，对相应的行列进行置0
 */
public class leetcode73 {
    public void setZeroes(int[][] matrix) {
        List<Integer> r=new ArrayList<>();
        List<Integer> c=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r.add(i);
                    c.add(j);
                }
            }
        }
        int len=r.size();
        for(int i=0;i<len;i++){
            helper(matrix,r.get(i),c.get(i));
        }
    }
    public void helper(int[][] matrix,int r,int c){
        //row
        for(int i=0;i<matrix[0].length;i++){
            matrix[r][i]=0;
        }
        //column
        for(int i=0;i<matrix.length;i++){
            matrix[i][c]=0;
        }
    }
}
