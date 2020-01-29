package weeklycontest;

public class leetcode1261 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class FindElements {
        TreeNode head=null;
        public FindElements(TreeNode root) {
            helper(root,0);
            this.head=root;
        }
        public void helper(TreeNode node,int x){
            if(node==null)return;
            helper(node.left,2*x+1);
            node.val=x;
            // System.out.println("--------"+node.val);
            helper(node.right,2*x+2);
        }

        public boolean find(int target) {
            return temp(head,target);
        }
        public boolean temp(TreeNode node,int target){
            if(node==null)return false;
            if(node.val==target){
                return true;
            }
            return temp(node.left,target)||temp(node.right,target);
        }
    }
}
