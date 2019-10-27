package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 对字符串数组排序后是字典序
 */
public class leetcode1233 {
    class Solution {
        public List<String> removeSubfolders(String[] folder) {
            List<String> res=new ArrayList<>();
            Arrays.sort(folder);
            for(int i=0;i<folder.length;i++){
                if(res.size()==0||
                        !folder[i].startsWith(res.get(res.size()-1)+"/")){
                    res.add(folder[i]);
                }
            }
            return res;
        }
    }
}
