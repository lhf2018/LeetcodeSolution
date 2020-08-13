package tree;

public class leetcode226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        TreeNode left=invertTree(root.right);
        TreeNode right=invertTree(root.left);
        root.left=left;
        root.right=right;
        return root;
    }
}
