package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * list存前序遍历，排序一下，就是中序遍历，使用前序遍历和中序遍历恢复二叉树
 */
public class leetcode449 {


     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
     }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if(root==null)return "";
            List<String> list=helper(root);
            return String.join(",",list);
        }
        public List<String> helper(TreeNode root){
            List<String> list=new ArrayList<>();
            if(root==null)return list;
            list.add(String.valueOf(root.val));
            list.addAll(helper(root.left));
            list.addAll(helper(root.right));
            return list;
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data.length()==0)return null;
            String[] temp=data.split(",");
            int[] a=new int[temp.length];
            for(int i=0;i<temp.length;i++){
                a[i]=Integer.parseInt(temp[i]);
            }
            int[] b=a.clone();
            Arrays.sort(b);
            return helper1(a,b,0,a.length-1,0,b.length-1);
        }
        public TreeNode helper1(int[] pre,int[] in,int prestart,int preend,int instart,int inend){
            if(prestart>preend||instart>inend){
                return null;
            }
            TreeNode root=new TreeNode(pre[prestart]);
            for(int i=instart;i<=inend;i++){
                if(in[i]==pre[prestart]){
                    root.left=helper1(pre,in,prestart+1,prestart+i-instart,instart,i-1);
                    root.right=helper1(pre,in,prestart+i-instart+1,preend,i+1,inend);
                    break;
                }
            }
            return root;
        }
    }
}
