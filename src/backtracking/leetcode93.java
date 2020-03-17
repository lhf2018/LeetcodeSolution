package backtracking;

import java.util.ArrayList;
import java.util.List;

public class leetcode93 {
    class Solution {
        List<String> res=new ArrayList<>();
        public List<String> restoreIpAddresses(String s) {
            helper(new ArrayList<>(),0,s);
            return res;
        }
        public void helper(List<String> segment,int index,String s){
            if(segment.size()>4)return;
            if(segment.size()==4&&index==s.length()){
                StringBuilder sb=new StringBuilder();
                for(int i=0;i<segment.size();i++){
                    sb.append(segment.get(i));
                    if(i!=segment.size()-1){
                        sb.append(".");
                    }
                }
                res.add(sb.toString());
            }
            for(int i=1;i<4;i++){
                if(index+i>s.length()){
                    break;
                }
                String str=s.substring(index,index+i);
                if(str.startsWith("0")&&str.length()>1){
                    continue;
                }
                if(Integer.parseInt(str) > 255){
                    continue;
                }
                segment.add(str);
                helper(segment,index+i,s);
                segment.remove(segment.size()-1);
            }
        }
    }
}
