package linked_list;

/**
 * 先把后半部分链表反转，然后和前半部分拼接成题目要求
 */
public class leetcode143 {
    //节点
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;

        // 找到链表的一半 快慢指针
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        fast=slow.next;
        slow.next=null;
        slow=head;
        //反转链表
        ListNode next1=fast;

        while(fast.next!=null){
            ListNode temp=fast.next;
            fast.next=temp.next;
            temp.next=next1;
            next1=temp;
        }
        fast=next1;
        //链表重排
        ListNode node=head;
        while(fast!=null){

            ListNode temp1=node.next;
            ListNode temp2=fast.next;

            node.next=fast;
            fast.next=temp1;

            node=temp1;
            fast=temp2;
        }

    }
}
