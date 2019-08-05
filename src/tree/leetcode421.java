package tree;

/**
 * 题目：给定一个非空数组，数组中元素为 a0, a1, a2, … , an-1，其中 0 ≤ ai < 231 。
 *
 * 找到 ai 和aj 最大的异或 (XOR) 运算结果，其中0 ≤ i,  j < n 。
 *
 * 你能在O(n)的时间解决这个问题吗？
 * 时间：27 ms
 * 思路：使用字典树
 * 第一步：二进制高位为1会大于低位的所有和，比如"11111111"最高位代表的"1"按权展开为128，
 * 而后面的“1111111”按权展开的和也只是127。所以进行异或时应该尽量选择高位异或结果为“1”的。
 * 第一步：遍历数组，我们按照二进制[31,30,…,1, 0]各位的状态进行建树，left放置0，right放置1。
 * 比如某个int型数的二进制是"0110110…"，我们需要将其放置到[left,right,right,left,right,right,left…]。
 * 第二步：遍历数组，根据数组中的每一个数去字典中查找尽量每一位都相反的数，求异或，取最大值
 *
 */
public class leetcode421 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public int findMaximumXOR(int[] nums) {
        TreeNode root=new TreeNode(-1);
        for(int num:nums){
            TreeNode node=root;
            for(int i=31;i>=0;i--){
                if((num&(1<<i))==0){
                    if(node.left==null){
                        node.left=new TreeNode(0);
                    }
                    node=node.left;
                }else{
                    if (node.right == null) {
                        node.right = new TreeNode(1);
                    }
                    node = node.right;
                }
            }
            node.left=new TreeNode(num);
        }
        int max=0;
        for(int n:nums){
            TreeNode node=root;
            for(int i=31;i>=0;i--){
                if ((n & (1<<i)) == 0) {
                    if(node.right!=null){
                        node=node.right;
                    }else{
                        node=node.left;
                    }
                }else{
                    if(node.left!=null){
                        node=node.left;
                    }else{
                        node=node.right;
                    }
                }
            }
            int temp=node.left.val;
            max=Math.max(max,n^temp);
        }
        return max;
    }
}
