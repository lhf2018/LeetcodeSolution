package tree;

/**
 *
 * 博客见：https://lhf2018.github.io/2019/11/23/124.%E4%BA%8C%E5%8F%89%E6%A0%91%E4%B8%AD%E7%9A%84%E6%9C%80%E5%A4%A7%E8%B7%AF%E5%BE%84%E5%92%8C/
 */
public class leetcode124 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    class Solution {
        int max=Integer.MIN_VALUE;
        public int maxPathSum(TreeNode root) {
            if(root==null){
                return 0;
            }
            helper(root);
            return max;
        }
        public int helper(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=helper(root.left);
            int right=helper(root.right);
            int temp=root.val+(Math.max(left,0)+Math.max(right,0));
            max=Math.max(max,temp);
            return root.val+Math.max(Math.max(left,0),Math.max(right,0));
        }

    }
}
