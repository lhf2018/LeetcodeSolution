package math;

/**
 * X->Y对应Y->X Y可执行+1或/2，Y先不停的除以2 一直到小于X为止，然后一直+1直到X
 */
public class leetcode991 {
    public int brokenCalc(int X, int Y) {
        if(X>=Y)return X-Y;
        int res=0;
        while(Y!=X){
            if(Y%2==0){
                Y=Y/2;
                res++;
            }else{
                Y=(Y+1)/2;
                res+=2;
            }
            if(Y<X){
                res+=(X-Y);
                Y=X;
            }
        }
        return res;
    }
}
