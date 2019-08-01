package divide_and_conquer;

public class leetcode932 {
    public int[] beautifulArray(int N) {
        int[] res=new int[N];
        if(N==1){
            res[0]=1;
        }else{
            int[] temp1=beautifulArray((N+1)/2);
            for(int i=0;i<temp1.length;i++){
                res[i]=2*temp1[i]-1;
            }
            int[] temp2=beautifulArray(N/2);
            for(int i=0;i<temp2.length;i++){
                res[i+temp1.length]=2*temp2[i];
            }
        }
        return res;
    }
}
