package biweeklycontest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * leetcode 字母组合迭代器
 * 解题思路：通过深度优先搜索把所有这个长度的字典序添加进list，排序后结果就是字典序
 */
public class No5123 {
    class CombinationIterator {
        List<String> list=new ArrayList<>();
        char[] ch;
        int len;
        int n=0;
        public CombinationIterator(String characters, int combinationLength) {
            ch=characters.toCharArray();
            len=combinationLength;
            helper("",0,0);
            Collections.sort(list);

        }
        public void helper(String str,int index,int num){
            if(num==len){
                list.add(str);
                return;
            }
            if(index>=ch.length){
                return;
            }
            for(int i=index;i<ch.length;i++){
                helper(str+ch[i],i+1,num+1);
            }
        }

        public String next() {
            return list.get(n++);

        }

        public boolean hasNext() {
            return n<list.size();
        }
    }
}
