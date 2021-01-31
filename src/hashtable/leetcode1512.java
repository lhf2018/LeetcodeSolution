package hashtable;

public class leetcode1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] arr=new int[101];
        int res=0;
        for(int i:nums){
            arr[i]++;
        }
        for(int i:arr){
            res+=i*(i-1)/2;
        }
        return res;
    }
}
