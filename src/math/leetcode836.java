package math;

/**
 * 考虑不相交的情况，剩下的都相交
 */
public class leetcode836 {
    class Solution {
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            if(rec1[2]<=rec2[0]||rec2[2]<=rec1[0]){
                return false;
            }
            if(rec1[3]<=rec2[1]||rec2[3]<=rec1[1]){
                return false;
            }
            return true;
        }
    }
}
