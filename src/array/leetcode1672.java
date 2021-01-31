package array;

public class leetcode1672 {
    public int maximumWealth(int[][] accounts) {
        int res=0;
        for(int i=0;i<accounts.length;i++){
            int max=0;
            for(int j:accounts[i]){
                max+=j;
            }
            res=Math.max(res,max);
        }
        return res;
    }
}
