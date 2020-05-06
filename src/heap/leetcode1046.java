package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode1046 {
    class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> queue=new PriorityQueue<Integer>(new Comparator<Integer>(){
                public int compare(Integer o1,Integer o2){
                    return o2-o1;
                }
            });
            for(int i=0;i<stones.length;i++){
                queue.offer(stones[i]);
            }
            while(queue.size()>1){
                int a=queue.poll();
                int b=queue.poll();
                if(a!=b){
                    queue.offer(Math.max(a,b)-Math.min(a,b));
                }
            }
            return queue.size()>0?queue.poll():0;
        }
    }
}
