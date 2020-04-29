package divide_and_conquer;

public class leetcode50 {
    class Solution {
        public double myPow(double x, int n) {
            if(n==0)return 1;
            if(n>0){
                if(n%2==0){
                    double temp=myPow(x,n/2);
                    return temp*temp;
                }else{
                    double temp=myPow(x,n/2);
                    return x*temp*temp;
                }
            }else{
                if(n%2==0){
                    double temp=myPow(x,n/2);
                    return temp*temp;
                }else{
                    double temp=myPow(x,n/2);
                    return (1/x)*temp*temp;
                }
            }

        }
    }
}
