package tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode1110 {
    List<TreeNode> res=new ArrayList<>();
    Set<Integer> set=new HashSet<>();
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        for(int i=0;i<to_delete.length;i++)set.add(to_delete[i]);
        root=helper(root);
        if(root!=null){
            res.add(root);
        }
        return res;
    }
    public TreeNode helper(TreeNode root){
        if(root==null)return null;
        root.left=helper(root.left);
        root.right=helper(root.right);
        //如果root的val在set中那么就删除，并把修剪过的左右节点放入res
        if(set.contains(root.val)){
            if(root.left!=null)res.add(root.left);
            if(root.right!=null)res.add(root.right);
            return null;
        }
        return root;
    }
}
