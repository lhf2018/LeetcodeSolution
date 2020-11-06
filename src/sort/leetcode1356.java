package sort;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode1356 {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums,new Comparator<Integer>(){
            @Override
            public int compare(Integer arr1,Integer arr2){
                int num1=Integer.bitCount(arr1);
                int num2=Integer.bitCount(arr2);
                if(num1<num2){
                    return -1;
                }else if(num1>num2){
                    return 1;
                }else{
                    return arr1-arr2;
                }
            }
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }
}
