package tree;

import java.util.ArrayList;
import java.util.List;

public class leetcode94 {
    List<Integer> res=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return res;
    }
    public void helper(TreeNode root){
        if(root==null)return;
        helper(root.left);
        res.add(root.val);
        helper(root.right);

    }
}
