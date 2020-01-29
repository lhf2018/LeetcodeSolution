package weeklycontest;

public class leetcode1317 {
    class Solution {
        public int[] getNoZeroIntegers(int n) {
            for(int i=1;i<n;i++){
                if(check(i)&&check(n-i)){
                    return new int[]{i,n-i};
                }
            }
            return null;

        }
        public boolean check(int num){
            String n=String.valueOf(num);
            if(n.contains("0")){
                return false;
            }else{
                return true;
            }
        }
    }
}
