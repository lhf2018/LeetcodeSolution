package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体解析见博客：https://blog.csdn.net/weixin_44128511/article/details/100273577
 */
public class leetcode655 {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    class Solution {
        public List<List<String>> printTree(TreeNode root) {
            int deep=helper(root);//总共有多少list
            int len=(int)(Math.pow(2,deep))-1;//list里的长度
            List<List<String>> res=new ArrayList<>();
            if(root==null)return res;
            for(int i=0;i<deep;i++){
                List<String> list=new ArrayList<>();
                for(int j=0;j<len;j++){
                    list.add("");
                }
                res.add(list);
            }
            helper2(root,res,0,len,0);
            return res;

        }
        //计算最大深度
        public int helper(TreeNode root){
            return root!=null?Math.max(helper(root.left),helper(root.right))+1:0;
        }
        //遍历二叉树，修改数据
        public void helper2(TreeNode root,List<List<String>> res,int start,int end,int deep){
            if(root!=null){
                int mid=(start+end)/2;
                res.get(deep).set(mid,String.valueOf(root.val));
                helper2(root.left,res,start,mid-1,deep+1);
                helper2(root.right,res,mid+1,end,deep+1);
            }
        }
    }
}
