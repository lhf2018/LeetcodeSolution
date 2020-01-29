package weeklycontest;

import java.util.ArrayList;
import java.util.List;

/**
 * 深度优先搜素
 */
public class leetcode1239 {
    class Solution {
        int max=0;
        public int maxLength(List<String> arr) {
            List<String> li=new ArrayList<>();
            OUTER:
            for(int i=0;i<arr.size();i++){
                int[] n=new int[26];
                for(char c:arr.get(i).toCharArray()){
                    if(n[c-'a']>0){
                        continue OUTER;
                    }else{
                        n[c-'a']++;
                    }
                }
                li.add(arr.get(i));
            }
            helper(li,new ArrayList<>(),0,li.size());
            return max;
        }
        public void helper(List<String> arr,List<Character> list,int start,int len){
            if(start>=len){
                // max=Math.max(list.size(),max);
                return;
            }
            OUTER:
            for(int i=start;i<len;i++){
                String str=arr.get(i);
                for(char c:str.toCharArray()){
                    if(list.contains(c)){
                        continue OUTER;
                    }
                }
                for(char c:str.toCharArray()){
                    list.add(c);
                }

                max=Math.max(list.size(),max);

                helper(arr,list,i+1,len);

                for(char c:str.toCharArray()){

                    list.remove(list.size()-1);
                }


            }


        }
    }
}
