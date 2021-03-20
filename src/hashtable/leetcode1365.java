package hashtable;

public class leetcode1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[101];
        int[] res=new int[nums.length];
        for(int i:nums){
            arr[i]++;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            arr[i]=count;
            count+=temp;
        }
        for(int i=0;i<nums.length;i++){
            res[i]=arr[nums[i]];
        }
        return res;
    }
}
