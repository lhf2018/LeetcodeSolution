package weeklycontest;

import java.util.ArrayList;
import java.util.List;

/**
 * 暴力破解
 */
public class leetcode1237 {
    class Solution {
        public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
            List<List<Integer>> res=new ArrayList<>();
            for(int i=1;i<=1000;i++){
                for(int j=1;j<=1000;j++){
                    if(customfunction.f(i,j)==z){
                        List<Integer> list=new ArrayList<>();
                        list.add(i);
                        list.add(j);
                        res.add(list);
                    }
                }
            }
            return res;

        }
    }

    abstract class CustomFunction {
        // Returns f(x, y) for any given positive integers x and y.
        // Note that f(x, y) is increasing with respect to both x and y.
        // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
        public abstract int f(int x, int y);
    }
}


