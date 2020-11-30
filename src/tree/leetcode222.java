package tree;

/**
 * 深度优先搜索
 */
public class leetcode222 {
    //方法一
    public int countNodes(TreeNode root) {
        TreeNode l=root;
        TreeNode r=root;
        int hl=0;
        int ht=0;
        while (l != null) {
            l = l.left;
            hl++;
        }
        while(r!=null){
            r=r.right;
            ht++;
        }
        if(hl==ht){
            return (int)(Math.pow(2,hl))-1;
        }else{
            return 1+countNodes(root.left)+countNodes(root.right);
        }
    }
    //方法二
    private int res=0;
    public int countNodes2(TreeNode root) {
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
