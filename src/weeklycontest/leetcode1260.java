package weeklycontest;

import java.util.ArrayList;
import java.util.List;

public class leetcode1260 {
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            for(int i=0;i<k;i++){

                grid=helper(grid);
            }
            List<List<Integer>> res=new ArrayList<>();
            for(int i=0;i<grid.length;i++){
                List<Integer> list=new ArrayList<>();
                for(int j=0;j<grid[0].length;j++){
                    list.add(grid[i][j]);
                }
                res.add(list);
            }
            return res;

        }
        public int[][] helper(int[][] grid){
            int[][] temp=new int[grid.length][grid[0].length];
            for(int i=0;i<grid[0].length;i++){
                if(i==0){
                    temp[0][0]=grid[grid.length-1][grid[0].length-1];
                    for(int j=1;j<grid.length;j++){
                        temp[j][i]=grid[j-1][grid[0].length-1];
                    }
                }else{
                    for(int j=0;j<grid.length;j++){
                        temp[j][i]=grid[j][i-1];
                    }
                }

            }
            return temp;

        }
    }
}
