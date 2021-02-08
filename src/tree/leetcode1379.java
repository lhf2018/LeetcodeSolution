package tree;

public class leetcode1379 {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(cloned==null||original==null){
            return null;
        }
        if(target==original){
            return cloned;
        }
        TreeNode temp=getTargetCopy(original.left,cloned.left,target);
        if(temp!=null){
            return temp;
        }else{
            return getTargetCopy(original.right,cloned.right,target);
        }
    }
}
