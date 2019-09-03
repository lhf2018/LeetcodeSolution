package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 把数组遍历的路径设置为string，存入hashmap来查找是否是重复的
 */
public class leetcode652 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    class Solution {
        List<TreeNode> res=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

            helper(root);
            return res;
        }
        public String helper(TreeNode root){
            if(root==null)return "+";

            String left=helper(root.left);
            String right=helper(root.right);
            String str=root.val+left+right;
            if(map.containsKey(str)){
                if(map.get(str)==1){
                    res.add(root);
                    map.put(str,0);
                }


            }else{
                map.put(str,1);
            }
            return str;

        }
    }
}
