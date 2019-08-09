package linked_list;

import java.util.ArrayList;
import java.util.List;

/**
 * 把节点值用两个链表存起来，然后按照规则相加，然后赋值给新的链表
 */
public class leetcode445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        while(l1!=null){
            list1.add(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            list2.add(l2.val);
            l2=l2.next;
        }
        int temp=0;//负责进位
        int index1=list1.size()-1;
        int index2=list2.size()-1;
        while(index1>=0&&index2>=0){
            int n=list1.get(index1--)+list2.get(index2--)+temp;
            res.add(n%10);
            temp=n/10;
        }
        if(index1>=0){
            for(int i=index1;i>=0;i--){
                int n=temp+list1.get(i);
                res.add(n%10);
                temp=n/10;
            }
        }
        if(index2>=0){
            for(int i=index2;i>=0;i--){
                int n=temp+list2.get(i);
                res.add(n%10);
                temp=n/10;
            }
        }
        if(temp==1)res.add(1);
        ListNode head=new ListNode(0);
        ListNode node=head;
        for(int i=res.size()-1;i>=0;i--){
            node.next=new ListNode(res.get(i));
            node=node.next;
        }

        return head.next;
    }
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
