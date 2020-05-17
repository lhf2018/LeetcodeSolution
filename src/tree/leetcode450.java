package tree;

/**
 * 递归
 */
public class leetcode450 {
    class Solution {
        public TreeNode deleteNode(TreeNode root, int key) {
            if(root==null){
                return null;
            }
            if(key==root.val){
                if(root.left==null){
                    return root.right;
                }
                if(root.right==null){
                    return root.left;
                }
                TreeNode node=root.right;
                while(node.left!=null){
                    node=node.left;
                }
                node.left=root.left;
                return root.right;
            }else if(key<root.val){
                root.left=deleteNode(root.left,key);
            }else{
                root.right=deleteNode(root.right,key);
            }
            return root;
        }
    }
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
}
