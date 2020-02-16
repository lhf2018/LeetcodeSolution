package array;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 题目：多次求和构造目标数组
 */
public class No5343 {
    /**
     * 方法一
     */
    class Solution1 {
        public boolean isPossible(int[] target) {
            while(true){
                int max=0;
                int index=0;
                long sum=0;
                for(int i=0;i<target.length;i++){
                    sum+=target[i];
                    if(target[i]>max){
                        index=i;
                        max=target[i];
                    }
                }
                if(max==1){
                    break;
                }
                long temp=max*2-sum;
                if(temp<1){
                    return false;
                }
                target[index]=(int)(temp);
            }
            return true;
        }
    }

    /**
     * 方法二
     */
    class Solution2 {
        public boolean isPossible(int[] target) {
            PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>(){ //大顶堆，容量11
                @Override
                public int compare(Integer i1,Integer i2){
                    return i2-i1;
                }
            });
            long sum=0;
            for(int i=0;i<target.length;i++){
                queue.offer(target[i]);
                sum+=target[i];
            }
            while(true){
                long temp=queue.poll();
                if(temp==1){
                    break;
                }
                long n=sum-temp;
                temp=temp*2-sum;
                if(temp<1){
                    return false;
                }
                queue.offer((int)(temp));
                sum=n+temp;

            }
            return true;
        }
    }
}
