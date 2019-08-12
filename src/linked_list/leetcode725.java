package linked_list;

/**
 * 解析在个人博客：https://blog.csdn.net/weixin_44128511/article/details/99305451
 */
public class leetcode725 {
    class Solution {
        public ListNode[] splitListToParts(ListNode root, int k) {
            ListNode node=root;
            int num=0;
            while(node!=null){
                num++;
                node=node.next;
            }
            ListNode[] res=new ListNode[k];
            int[] list=new int[k];//标记该节点有多长的链表
            int temp1=num/k;  //每个节点的基础数量，其中temp2个链表长度为temp1+1
            int temp2=num%k; //长度为temp1+1的数量
            for(int i=0;i<k;i++){
                if(i<temp2){
                    list[i]=temp1+1;
                }else{
                    list[i]=temp1;
                }
            }
            ListNode head=root; //用来存放当前节点
            ListNode fast=null; //用来存放上一个节点
            OUTER:
            for(int i=0;i<res.length;i++){
                int temp=list[i];
                res[i]=head;
                for(int j=0;j<temp-1;j++){
                    if(head==null)break OUTER;
                    head=head.next;
                }
                fast=head;
                if(head==null)break;
                head=head.next;
                fast.next=null;
            }
            return res;
        }
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
