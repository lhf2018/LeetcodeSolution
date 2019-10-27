package weeklycontest;

import java.util.ArrayList;
import java.util.List;

/**
 * 格雷码 i=i^(i/2)
 */
public class No5239 {
    class Solution {
        public List<Integer> circularPermutation(int n, int start) {
            List<Integer> res=new ArrayList<>();
            List<Integer> list=new ArrayList<>();
            int len=(int)(Math.pow(2,n));
            int num=0;
            for(int i=0;i<len;i++){
                int temp=(i^(i>>1));
                if(temp==start)num=i;
                list.add(temp);
            }

            for(int i=0;i<len;i++){
                res.add(list.get((num++)%len));
            }
            return res;

        }
    }
}
