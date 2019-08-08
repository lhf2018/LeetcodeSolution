package tree;

/**
 * 记录两个值，一个最大值，一个最小值，到最后一个节点时，计算两个值之差
 */
public class leetcode1026 {
    public int maxAncestorDiff(TreeNode root) {
        int left=helper(root.left,root.val,root.val);
        int right=helper(root.right,root.val,root.val);
        return Math.max(left,right);
    }
    public int helper(TreeNode root,int MIN,int MAX){
        if(root==null){
            return 0;
        }
        if(root.val > MAX){
            MAX = root.val;
        }
        else if(root.val < MIN){
            MIN = root.val;
        }
        if(root.left==null&&root.right==null){
            return MAX-MIN;
        }
        int left=helper(root.left,MIN,MAX);
        int right=helper(root.right,MIN,MAX);
        return Math.max(right,left);
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
