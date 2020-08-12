package sort;

import java.util.Arrays;

public class leetcode324 {
    //方法一时间复杂度o(nlogn)
    public void wiggleSort(int[] nums) {
        int[] arr=nums.clone();
        Arrays.sort(arr);
        int front=(nums.length+1)/2-1;
        int behind=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if((i&1)==0){
                nums[i]=arr[front--];
            }else{
                nums[i]=arr[behind--];
            }
        }
    }
    //方法2
    public void wiggleSort2(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            max=Math.max(n,max);
        }
        int[] arr=new int[max+1];
        for(int n:nums){
            arr[n]++;
        }
        int odd=1;
        int even=0;
        int i;
        for(i=arr.length-1;i>=0;i--){
            while(odd<nums.length&&arr[i]>0){
                nums[odd]=i;
                odd+=2;
                arr[i]--;
            }
            if(odd>=nums.length)break;
        }
        for(;i>=0;i--){
            while(even<nums.length&&arr[i]>0){
                nums[even]=i;
                even+=2;
                arr[i]--;
            }
            if(even>=nums.length)break;
        }
    }
}
