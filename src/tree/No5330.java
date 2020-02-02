package tree;

/**
 * 题目：分裂二叉树的最大乘积
 * 注意：不能提前对答案取模
 */
public class No5330 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    class Solution {
        long total=0;
        long max=0;
        long mod=1000000007;
        public int maxProduct(TreeNode root) {
            helper(root);
            helper2(root);
            return (int)(max%mod);

        }
        public void helper(TreeNode root){
            if(root==null)return;
            helper(root.left);
            total+=root.val;
            helper(root.right);
        }
        public long helper2(TreeNode root){
            if(root==null)return 0;
            long left=helper2(root.left);
            long right=helper2(root.right);
            max=Math.max(max,(left*(total-left)));
            max=Math.max(max,(right*(total-right)));
            return left+right+root.val;

        }

    }
}
