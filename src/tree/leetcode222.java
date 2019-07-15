package tree;

/**
 * 深度优先搜索
 */
public class leetcode222 {
    private int res=0;
    public int countNodes(TreeNode root) {
        helper(root);
        return res;
    }
    public void helper(TreeNode root){
        if(root==null)return;
        helper(root.left);
        res++;
        helper(root.right);
    }
}
