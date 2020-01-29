package weeklycontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 搜索推荐系统
 */
public class leetcode1268 {
    class Solution {
        public List<List<String>> suggestedProducts(String[] products, String searchWord) {
            Arrays.sort(products);
            List<List<String>> res=new ArrayList<>();
            String temp="";
            for(char c:searchWord.toCharArray()){
                temp+=c;
                // System.out.println(temp);
                int index=-1;
                for(int i=0;i<products.length;i++){
                    if(products[i].startsWith(temp)){
                        index=i;
                        break;
                    }
                }
                List<String> list=new ArrayList<>();
                if(index==-1){
                    res.add(list);
                    continue;
                }
                for(int i=index;i<products.length&&i<index+3;i++){
                    if(products[i].startsWith(temp)){
                        list.add(products[i]);
                    }
                }
                res.add(list);
            }
            return res;
        }
    }
}
