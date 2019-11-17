package weeklycontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No5265 {
    class Solution {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        public int maxSumDivThree(int[] nums) {
            int sum=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]%3==1){
                    list1.add(nums[i]);
                }else if(nums[i]%3==2){
                    list2.add(nums[i]);
                }
                sum+=nums[i];

            }
            if(sum%3==0)return sum;
            Collections.sort(list1);
            Collections.sort(list2);
            System.out.println(sum);
            if(sum%3==1){
                int temp1=Integer.MAX_VALUE;
                int temp2=Integer.MAX_VALUE;
                if(list1.size()>0){
                    temp1=list1.get(0);
                }
                if(list2.size()>1){
                    temp2=list2.get(0)+list2.get(1);
                }
                if(temp1==Integer.MAX_VALUE&&temp2==Integer.MAX_VALUE){
                    sum=0;
                }else{
                    sum-=(int)(Math.min(temp2,temp1));
                }
            }else{
                int temp1=Integer.MAX_VALUE;
                int temp2=Integer.MAX_VALUE;
                if(list2.size()>0){
                    temp2=list2.get(0);
                    // System.out.println(temp2);
                }
                if(list1.size()>1){
                    temp1=list1.get(0)+list1.get(1);
                }
                if(temp1==Integer.MAX_VALUE&&temp2==Integer.MAX_VALUE){
                    sum=0;
                }else{
                    sum-=(int)(Math.min(temp2,temp1));
                }
            }
            return sum;
        }
    }
}
