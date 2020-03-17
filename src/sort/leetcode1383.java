package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class leetcode1383 {
    class Solution {
        public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
            int[][] arr=new int[n][2];
            for(int i=0;i<n;i++){
                arr[i][0]=speed[i];
                arr[i][1]=efficiency[i];
            }
            Arrays.sort(arr,new Comparator<int[]>(){
                public int compare(int[] o1,int[] o2){
                    return o2[1]-o1[1];
                }
            });
            PriorityQueue<Integer> queue=new PriorityQueue<>();
            long sum=0;
            long max=0;
            for(int i=0;i<n;i++){
                queue.add(arr[i][0]);
                sum+=arr[i][0];
                if(queue.size()>k){
                    sum-=queue.poll();

                }
                max=Math.max(max,(sum*arr[i][1]));
            }
            return (int)(max%1000000007);
        }
    }
}
