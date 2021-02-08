package array;

import java.util.ArrayList;
import java.util.List;

public class leetcode1476 {
    class SubrectangleQueries {
        private int[][] arr;
        private List<int[]> history;
        public SubrectangleQueries(int[][] rectangle) {
            arr=rectangle;
            history=new ArrayList<>();
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            history.add(new int[]{row1,col1,row2,col2,newValue});
        }

        public int getValue(int row, int col) {
            for(int i=history.size()-1;i>=0;i--){
                int row1=history.get(i)[0];
                int col1=history.get(i)[1];
                int row2=history.get(i)[2];
                int col2=history.get(i)[3];
                int val=history.get(i)[4];
                if(row>=row1&&row<=row2&&col>=col1&&col<=col2){
                    return val;
                }
            }
            return arr[row][col];
        }
    }
}
