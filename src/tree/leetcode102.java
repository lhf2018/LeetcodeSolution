package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode102 {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
            List<List<Integer>> res=new ArrayList<>();
            if(root==null)return res;
            while(!queue.isEmpty()){
                List<Integer> list=new ArrayList<>();
                int len=queue.size();
                for(int i=0;i<len;i++){
                    TreeNode temp=queue.poll();
                    list.add(temp.val);
                    if(temp.left!=null){
                        queue.offer(temp.left);
                    }
                    if(temp.right!=null){
                        queue.offer(temp.right);
                    }
                }
                res.add(list);
            }
            return res;

        }
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
}
