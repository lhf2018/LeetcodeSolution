package linked_list;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 * 思路：使用两个新的链表，一个存放小于x的节点，一个存放大于等于x的节点，最后合并两链表
 */
public class leetcode86 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode partition(ListNode head, int x) {
        ListNode big=new ListNode(0);
        ListNode temp=big;
        ListNode small=new ListNode(0);
        ListNode node=small;
        while(head!=null){
            if(head.val>=x){
                big.next=new ListNode(head.val);
                big=big.next;
            }else{
                small.next=new ListNode(head.val);
                small=small.next;
            }
            head=head.next;
        }
        small.next=temp.next;
        return node.next;
    }
}
