package double_pointer;

import java.util.ArrayList;
import java.util.List;

public class leetcode763 {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list=new ArrayList<>();
        int[] nums=new int[26];
        for(int i=0;i<S.length();i++){
            nums[S.charAt(i)-'a']=i;
        }
        int i=0;
        while(i<S.length()){
            int index=nums[S.charAt(i)-'a'];
            for(int j=0;j<index;j++){
                index=Math.max(index,nums[S.charAt(j)-'a']);
            }
            list.add(index-i+1);
            i=index+1;
        }
        return list;
    }
}
