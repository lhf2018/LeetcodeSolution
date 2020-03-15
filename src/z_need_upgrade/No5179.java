package z_need_upgrade;

import java.util.ArrayList;
import java.util.List;

public class No5179 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    /**
     * 保存下来，然后从list中间开始构建树
     */
    class Solution {
        List<Integer> list=new ArrayList<>();
        public TreeNode balanceBST(TreeNode root) {
            helper(root);
            return build(0,list.size()-1);
        }
        public void helper(TreeNode root){
            if(root==null)return;
            helper(root.left);
            list.add(root.val);
            helper(root.right);
        }
        public TreeNode build(int start,int end){
            if(start>end)return null;
            if(start==end)return new TreeNode(list.get(start));
            int mid=(start+end)/2;
            TreeNode root=new TreeNode(list.get(mid));
            TreeNode left=build(start,mid-1);
            TreeNode right=build(mid+1,end);
            root.left=left;
            root.right=right;
            return root;
        }
    }
}
