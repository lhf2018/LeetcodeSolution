package tree;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode1302 {
    /**
     * 方法一：层序遍历
     * @param root
     * @return
     */
    public int deepestLeavesSum1(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        int res=0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            int temp=0;
            while(len-->0){
                TreeNode node=queue.poll();
                temp+=node.val;
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            res=(temp==0?res:temp);
        }
        return res;
    }

    /**
     * dfs
     */
    int maxDepth = 0;
    int ans = 0;

    private void dfs(TreeNode node, int depth) {
        if(node.left == null && node.right == null) {
            if(depth == maxDepth) {
                ans += node.val;
            } else if(depth > maxDepth) {
                ans = node.val;
                maxDepth = depth;
            }
        } else {
            if(node.left != null) {
                dfs(node.left, depth + 1);
            }
            if(node.right != null) {
                dfs(node.right, depth + 1);
            }
        }
    }

    public int deepestLeavesSum2(TreeNode root) {
        dfs(root, 0);
        return ans;

    }
}
