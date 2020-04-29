package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历是递增数组
 */
public class leetcode98 {
    class Solution {
        List<Integer> list=new ArrayList<>();
        public boolean isValidBST(TreeNode root) {
            helper(root);
            for(int i=1;i<list.size();i++){
                if(list.get(i)<=list.get(i-1)){
                    return false;
                }
            }
            return true;
        }
        public void helper(TreeNode root){
            if(root==null){
                return;
            }
            helper(root.left);
            list.add(root.val);
            helper(root.right);
        }
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
}
