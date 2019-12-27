package array;

import java.util.PriorityQueue;

/**
 * 维护一个小顶堆，只留下最大的k个
 */
public class leetcode215 {
    class Solution {
        public int findKthLargest(int[] nums, int k) {
            PriorityQueue<Integer> queue=new PriorityQueue<>();
            for(int i=0;i<nums.length;i++){
                queue.add(nums[i]);
                if(queue.size()>k){
                    queue.poll();
                }
            }
            return queue.poll();
        }
    }
}
