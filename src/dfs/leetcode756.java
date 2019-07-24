package dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 采用hashmap+dfs
 */
public class leetcode756 {
    //map存储allowed中前两位的key与最后一位的value
    Map<String, List<Character>> map=new HashMap<>();
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        for(int i=0;i<allowed.size();i++){
            String temp=allowed.get(i).charAt(0)+""+allowed.get(i).charAt(1);
            List<Character> list=map.getOrDefault(temp,new ArrayList<Character>());
            list.add(allowed.get(i).charAt(2));
            map.put(temp,list);
        }
        return dfs(bottom);
    }
    private boolean dfs(String bottom){
        if(bottom.length()==1)return true;
        List<List<Character>> list=new ArrayList<>();

        int len=bottom.length();
        //获取所有可能的父亲集合
        for(int i=0;i<len-1;i++){
            String temp=bottom.substring(i,i+2);
            if(map.containsKey(temp)){
                list.add(map.get(temp));
            }else{
                return false;
            }
        }
        List<String> bottoms=new ArrayList<>();
        //计算这一层所有可能的string
        helper(bottoms,list,0,"");

        for(int i=0;i<bottoms.size();i++){
            if(dfs(bottoms.get(i))){
                return true;
            }
        }
        return false;
    }
    //计算这一层所有可能的string
    public void helper(List<String> bottoms,List<List<Character>> list,
                       int index,String str){
        if(index==list.size()){
            bottoms.add(str);
            return;
        }
        for(char c:list.get(index)){
            helper(bottoms,list,index+1,str+c);
        }
    }
}
