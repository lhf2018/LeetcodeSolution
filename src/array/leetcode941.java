package array;

public class leetcode941 {
    public boolean validMountainArray(int[] A) {
        int i=1;
        while(i<A.length&&A[i]>A[i-1]){
            i++;
        }
        if(i==1||i==A.length){
            return false;
        }
        while(i<A.length&&A[i-1]>A[i]){
            i++;
        }
        return i==A.length;
    }
}
