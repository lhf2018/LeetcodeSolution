package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * leetcode609 在系统中查找重复文件
 * 题目：给定一个目录信息列表，包括目录路径，以及该目录中的所有包含内容的文件，您需要找到文件系统中的所有重复文件组的路径。一组重复的文件至少包括二个具有完全相同内容的文件。
 * 链接：https://leetcode-cn.com/problems/find-duplicate-file-in-system
 *
 * 思路：分割字符串，建立hashmap存储内容，最后拼接字符串
 */
public class leetcode609 {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> map=new HashMap<>();
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<paths.length;i++){
            String[] temp=paths[i].split(" ");
//            从第二个开始遍历，数组第一个为文件路径
            for(int j=1;j<temp.length;j++){
                String content=helper(temp[j]);
                List<String> list=map.getOrDefault(content,new ArrayList<>());
                int index=temp[j].lastIndexOf("(");
                String str=temp[j].substring(0,index);
                list.add(temp[0]+"/"+str);
                map.put(content,list);
            }
        }
        for(String str:map.keySet()){
            if(map.get(str).size()>1){
                res.add(map.get(str));
            }
        }
        return res;
    }
    //     匹配“(”，返回字符串中文件的内容
    public String helper(String path){
        int index=path.lastIndexOf("(");
        String res=path.substring(index+1);
        return res;
    }
}
