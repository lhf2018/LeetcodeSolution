package dfs;

import java.util.Arrays;

public class leetcode805 {
    public boolean splitArraySameAverage(int[] A) {
        int total=0;
        double avg=0;
        for(int i=0;i<A.length;i++){
            total+=A[i];
        }
        avg=total*1.0/A.length;
        Arrays.sort(A);
        return helper(A,0,0,0,avg);
    }
    public boolean helper(int[] A,int total,int index,int num,double avg){
        if(index==A.length){
            return (total*1.0/num)==avg&&num!=A.length;
        }
        if(num>0&&(total*1.0/num)==avg){
            // System.out.println(total+" "+num);
            return true;
        }
        for(int i=index;i<A.length;i++){
            if(i!=index&&A[i]==A[i-1])continue;
            if(helper(A,total+A[i],i+1,num+1,avg)){
                return true;
            }

        }
        return false;
    }
}
