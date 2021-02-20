package array;

public class leetcode697 {
    public int findShortestSubArray(int[] nums) {
        int[] arr=new int[50001];
        int[] maxp=new int[50001];
        int[] minp=new int[50001];
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==0){
                minp[nums[i]]=i;
            }
            maxp[nums[i]]=i;
            arr[nums[i]]++;
            max=Math.max(arr[nums[i]],max);

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                min=Math.min(maxp[i]-minp[i]+1,min);
            }
        }
        return min;
    }
}
