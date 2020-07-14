package hashtable;

import java.util.*;

public class leetcode350 {
    /**
     * 方法一
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1=new HashMap<>();
        Map<Integer,Integer> map2=new HashMap<>();
        for(int i:nums1){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }
        for(int i:nums2){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(int i:map1.keySet()){
            if(map2.containsKey(i)){
                for(int j=0;j<Math.min(map1.get(i),map2.get(i));j++){
                    res.add(i);
                }
            }
        }
        int[] nums=new int[res.size()];
        for(int i=0;i<nums.length;i++){
            nums[i]=res.get(i);
        }
        return nums;
    }
    /**
     * 方法二
     */
    public int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        int index1=0;
        int index2=0;
        while(index1<nums1.length&&index2<nums2.length){
            if(nums1[index1]>nums2[index2]){
                index2++;
            }else if(nums1[index1]<nums2[index2]){
                index1++;
            }else{
                list.add(nums1[index1]);
                index1++;
                index2++;
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
