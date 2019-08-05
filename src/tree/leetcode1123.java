package tree;
/**
 * 使用helper函数，深度优先搜索计算最大深度
 * 主函数分别计算左右分支的深度，哪个深递归哪个
 * 一样深就说明是公共祖先了
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class leetcode1123 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        if(root==null){
            return null;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        if(left==right){
            return root;
        }else if(left<right){
            return lcaDeepestLeaves(root.right);
        }else{
            return lcaDeepestLeaves(root.left);
        }

    }
    public int helper(TreeNode root){
        if(root==null){
            return 0;
        }else{
            return Math.max(helper(root.left),helper(root.right))+1;
        }
    }
}
