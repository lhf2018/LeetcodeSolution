package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 参考个人博客：https://blog.csdn.net/weixin_44128511/article/details/100699036
 */
public class leetcode228 {
    class Solution {
        public List<String> summaryRanges(int[] nums) {
            List<String> list=new ArrayList<>();
            if(nums.length==0)return list;
            if(nums.length==1){
                list.add(nums[0]+"");
                return list;
            }
            int start=nums[0];
            int end=nums[0];
            for(int i=1;i<nums.length;i++){
                if(i==nums.length-1){
                    if(nums[i]==end+1){
                        list.add(start+"->"+nums[i]);
                        break;
                    }else{
                        if(start==end){
                            list.add(start+"");
                        }else{
                            list.add(start+"->"+end);
                        }
                        list.add(nums[i]+"");
                        break;
                    }
                }
                if(nums[i]==end+1){
                    end=nums[i];
                }else{
                    if(start==end){
                        list.add(start+"");
                    }else{
                        list.add(start+"->"+end);
                    }
                    start=nums[i];
                    end=start;
                }
            }
            return list;
        }
    }
}
