package tree;

public class leetcode235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if((root.val-p.val)*(root.val-q.val)<=0){
            return root;
        }else if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }else{
            return lowestCommonAncestor(root.left,p,q);
        }
    }
}
