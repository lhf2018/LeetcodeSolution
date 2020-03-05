package math;

public class leetcode1103 {
    class Solution {
        public int[] distributeCandies(int candies, int num_people) {
            int[] res=new int[num_people];
            int num=1;
            while(candies>0){
                if(candies>=num){
                    res[(num-1)%num_people]+=(num);
                    candies-=num;
                }else{
                    res[(num-1)%num_people]+=candies;
                    break;
                }
                num++;
            }
            return res;
        }
    }
}
