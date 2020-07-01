package array;

import java.util.PriorityQueue;

public class leetcode215 {
    /**
     * 方法一 直接使用Java优先队列，维护一个小顶堆，只留下最大的k个
     */
        public int findKthLargest1(int[] nums, int k) {
            PriorityQueue<Integer> queue=new PriorityQueue<>();
            for(int i=0;i<nums.length;i++){
                queue.add(nums[i]);
                if(queue.size()>k){
                    queue.poll();
                }
            }
            return queue.poll();
        }

    /**
     * 方法二 自己维护大顶堆
     */
    public int findKthLargest2(int[] nums, int k) {
        int len=nums.length;
        buildMaxHeigh(nums,len);//构建一个大顶堆
        for(int i=nums.length-1;i>nums.length-k;i--){
            swap(nums,0,i);
            len--;
            maxHeapify(nums,0,len);
        }
        return nums[0];
    }
    public void buildMaxHeigh(int[] nums,int len){
        for(int i=len/2;i>=0;i--){
            maxHeapify(nums,i,len);
        }
    }
    public void maxHeapify(int[] nums,int i,int heapSize){
        int l=2*i+1;
        int r=2*i+2;
        int largest=i;
        if(l<heapSize&&nums[l]>nums[largest]){
            largest=l;
        }
        if(r<heapSize&&nums[r]>nums[largest]){
            largest=r;
        }
        if(largest!=i){
            swap(nums,i,largest);
            maxHeapify(nums,largest,heapSize);
        }
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
