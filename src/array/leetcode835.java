package array;

/**
 * 835. 图像重叠
 * 思路：暴力破解
 */
public class leetcode835 {
    public int largestOverlap(int[][] A, int[][] B) {
        int res=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                int x=helper(A,B,i,j);
                int y=helper(B,A,i,j);
                res=Math.max(res,Math.max(x,y));
            }
        }
        return res;
    }
    public int helper(int[][] A,int[][] B,int i,int j){
        int max=0;
        int m=A.length;
        int n=A[0].length;
        for(int i1=i,i2=0;i1<m&&i2<m;i1++,i2++){
            for(int j1=j,j2=0;j1<n&&j2<n;j1++,j2++){
                max+=(A[i1][j1]&B[i2][j2]);
            }
        }
        return max;
    }
}
