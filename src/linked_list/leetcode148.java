package linked_list;

public class leetcode148 {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    private ListNode mergeSort(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next.next;
        ListNode l;
        ListNode r;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        r=mergeSort(slow.next);
        slow.next=null;
        l=mergeSort(head);
        return mergeList(l,r);
    }
    private ListNode mergeList(ListNode l,ListNode r){
        ListNode temp=new ListNode(1);
        ListNode p=temp;
        while(l!=null&&r!=null){
            if(l.val<r.val){
                p.next=l;
                l=l.next;
            }else{
                p.next=r;
                r=r.next;
            }
            p=p.next;
        }
        p.next=l==null?r:l;
        return temp.next;
    }
}
