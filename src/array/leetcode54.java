package array;

import java.util.ArrayList;
import java.util.List;

public class leetcode54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList<>();
        }
        int row=matrix.length;
        int col=matrix[0].length;
        List<Integer> res=new ArrayList<>();
        int top=0;
        int bottom=row-1;
        int left=0;
        int right=col-1;
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            for(int i=top+1;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            if(left<right&&top<bottom){
                for(int i=right-1;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                for(int i=bottom-1;i>top;i--){
                    res.add(matrix[i][left]);
                }
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return res;
    }
}
