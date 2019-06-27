package array;

/**
 * leetcode 885 螺旋矩阵
 * 1.螺旋走，画图可知，每走两条边时，每一条边的最大步长就增加1步，每一步为每次走一格，直到走到最大步长再转向
 * 2.当当前步数所在的位置处在矩阵之中，就把当前位置放在结果数组中
 * 3.用两个数组控制前进方向
 */
public class leetcode885_Spiral_Matrix_III {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};

        int[][] res = new int[R*C][2];
        int t = 0;

        res[t++] = new int[]{r0, c0};
        if (R * C == 1) return res;
        int len=0;
        int dir=0;
        int dr1=r0;
        int dr2=c0;
        while(t<R*C){
            len++;
            for(int i=0;i<2;i++){
                for(int j=0;j<len;j++){
                    dr1=dr1+dr[dir];
                    dr2=dr2+dc[dir];
                    if(dr1>=0&&dr1<R&&dr2>=0&&dr2<C){
                        res[t++] = new int[]{dr1, dr2};
                    }
                }
                dir=(dir+1)%4;
            }
        }
        return res;
    }
}
