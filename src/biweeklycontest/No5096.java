package biweeklycontest;

import java.util.ArrayList;
import java.util.List;

/**
 * 5096. 数组变换
 */
public class No5096 {
    class Solution {
        public List<Integer> transformArray(int[] arr) {
            OUTER:
            while(true){
                boolean flag=false;
                int[] temp=arr.clone();
                for(int i=1;i<arr.length-1;i++){
                    if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                        temp[i]--;
                        flag=true;
                    }
                    if(arr[i]<arr[i-1]&&arr[i]<arr[i+1]){
                        temp[i]++;
                        flag=true;
                    }
                }
                arr=temp.clone();
                if(!flag){
                    break OUTER;
                }
            }
            List<Integer> res=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                res.add(arr[i]);
            }
            return res;

        }
    }
}
